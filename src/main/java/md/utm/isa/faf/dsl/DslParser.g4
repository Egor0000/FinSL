parser grammar DslParser;

options {
    tokenVocab = DslLexer;
    superClass = DslParserBase;
}

program        : declaration*EOF;

// ##################### DECLARATIONS ##################################

declaration     : classDecl
                | funDecl
                | varDecl
                | statement
                | finDecl
                | balanceSheet
                | incomeState;

classDecl       : CLASS IDENTIFIER ( '<' IDENTIFIER )?'{' function* '}' ;
funDecl         : FUNCTION function ;
varDecl         : LET IDENTIFIER ( '=' expression )?  (OF TYPE entities)?;
finDecl         : IDENTIFIER OF entities '{'function*'}';
balanceSheet    : BALANCE_SHEET IDENTIFIER 'for' IDENTIFIER '{'(bal_equity | bal_assets | bal_liab)* statement* function* '}';
incomeState     : INCOME_STATEMENT IDENTIFIER 'for' IDENTIFIER '{' function*'}';


bal_assets      : ASSETS IDENTIFIER? '{' (asset_ex)+ '}';
bal_liab        : LIABILITIES IDENTIFIER? '{'(liab_ex)+'}';
bal_equity      : EQUITY IDENTIFIER? '{'(equity_ex)+'}';

asset_ex        : bal_sheet_assets '=' expression;
liab_ex         : bal_sheet_liab '=' expression;
equity_ex       : bal_sheet_equity '=' expression;

// todo add income statement

// ##################### STATEMENTS ####################################

statement      : exprStmt
               | forStmt
               | ifStmt
               | returnStmt
               | whileStmt
               | block ;

exprStmt       : expression  ;
forStmt        : FOR '(' ( varDecl | exprStmt | ';' )
                           expression? ';'
                           expression? ')' statement ;
ifStmt         : IF '(' expression ')' statement
                 ( ELSE statement )? ;
returnStmt     : RETURN expression? ';' ;
whileStmt      : WHILE '(' expression ')' statement ;
block          : '{' declaration* '}' ;


// ##################### EXPRESSIONS ###################################

expression     : assignment ';';

assignment     : ( call DOT )? IDENTIFIER '=' assignment
               | logic_or ;

logic_or       : logic_and ( OR logic_and )* ;
logic_and      : equality ( AND equality )* ;
equality       : comparison ( ( NOTEQUAL | EQUAL ) comparison )* ;
comparison     : term ( ( '>' | '>=' | '<' | '<=' ) term )* ;
term           : factor ( ( '-' | '+' ) factor )* ;
factor         : unary ( ( '/' | '*' ) unary )* ;

unary          : ( '!' | '-' ) unary | call ;
call           : primary | main_functions ( '(' arguments? ')' | DOT IDENTIFIER )*  ;

// add all number literals to primary
primary        : IDENTIFIER |BOOL_LITERAL | 'null' | 'this'
               | DECIMAL_LITERAL | FLOAT_LITERAL  | STRING_LITERAL |  '(' expression ')'
               | 'super' DOT IDENTIFIER ;

function       : IDENTIFIER  '(' parameters? ')' block ;
parameters     : IDENTIFIER ( ',' IDENTIFIER )* ;
arguments      : assignment ( ',' assignment )* ;

bal_sheet_assets    : CASH | EXPENSES | INVENTORY| ACCOUNTS | LONG_TERM;
bal_sheet_liab      : ACCOUNTS | OTHERS | LONG_TERM;
bal_sheet_equity    : CAPITAL | RETAINED;

entities: SRL | INDIVIDUAL;

// Functions
main_functions: IMPORT_FN | EXPORT_FN | PRINT | CALC_TAX;

