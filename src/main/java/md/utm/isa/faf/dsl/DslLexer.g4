lexer grammar DslLexer;

channels { ERROR }
// Keywords

ASSERT:             'assert';
BOOLEAN:            'boolean';
BREAK:              'break';
BYTE:               'byte';
CASE:               'case';
CATCH:              'catch';
CLASS:              'class';
CONST:              'const';
CONTINUE:           'continue';
DEFAULT:            'default';
DO:                 'do';
DOUBLE:             'double';
ELSE:               'else';
ENUM:               'enum';
EXTENDS:            'extends';
FOR:                'for';
FUNCTION:           'function';
IF:                 'if';
IS:                 'is';
IMPLEMENTS:         'implements';
IMPORT:             'import';
INTERFACE:          'interface';
NEW:                'new';
OF:                 'of'; // smth like extends or implements
ON:                 'on';
PRIVATE:            'private';
PUBLIC:             'public';
RETURN:             'return';
SHORT:              'short';
SUPER:              'super';
SWITCH:             'switch';
THIS:               'this';
THROW:              'throw';
THROWS:             'throws';
TRY:                'try';
TYPE:               'type';     //smth like record
WHILE:              'while';

// Financial
BALANCE_SHEET:      'balance sheet';
INCOME_STATEMENT:   'income statement';
ASSETS:             'assets';
LIABILITIES:        'liabilities';
EQUITY:             'equity';
CASH:               'cash';
EXPENSES:           'expenses';
INVENTORY:          'inventory';
ACCOUNTS:           'accounts';
LONG_TERM:          'long term';
OTHERS:             'others';
CAPITAL:            'capital';
RETAINED:           'retained';


//Entities
SRL:                'SRL';
INDIVIDUAL:         'Individual';

// Local Variable
LET:                'let';

// Identifiers

IDENTIFIER:         Letter LetterOrDigit*;

// Literals

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits FLOAT_POINT Digits? | FLOAT_POINT Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;
FLOAT_POINT:        '.' | ',';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"'
              |     '\'' (~["\\\r\n] | EscapeSequence)* '\'';

TEXT_BLOCK:         '"""' [ \t]* [\r\n] (. | EscapeSequence)*? '"""'
          |     '\'\'\'' [ \t]* [\r\n] (. | EscapeSequence)*?  '\'\'\'';
NULL_LITERAL:       'null';



// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';
// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                'and'
   |                '&&';
OR :                'or'
   |                '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';
EXP:                '**';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
AND_ASSIGN:         '&=';
OR_ASSIGN:          '|=';
MOD_ASSIGN:         '%=';
EXP_ASSIGN:         '**=';


// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);
UNEXPECTED_CHAR:    . -> channel(ERROR);


// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;