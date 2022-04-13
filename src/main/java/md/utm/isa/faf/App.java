package md.utm.isa.faf;

import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.DslLexer;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.DslParseListener;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.DslParser;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.DslVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        //todo add file here
        CharStream charStream = CharStreams.fromFileName("/path/to/file.ext");

        // Lexer
        DslLexer lexer = new DslLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        // Parser
        DslParser parser = new DslParser(commonTokenStream);

        // Listener
        parser.addParseListener(new DslParseListener());
        DslVisitor visitor = new DslVisitor();
        visitor.visit(parser.program());


    }
}
