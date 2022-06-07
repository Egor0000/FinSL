package md.utm.isa.faf;

import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.*;
import md.utm.isa.faf.utils.FileUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        //todo add file here
        File file = FileUtil.getFileFromResources("test.txt");
        CharStream charStream = CharStreams.fromPath(file.toPath());

        // Lexer
        DslLexer lexer = new DslLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        // Parser
        DslParser parser = new DslParser(commonTokenStream);

        // Visit root
        DslVisitor visitor = new DslVisitor();
        DslParser.ProgramContext programContext = parser.program();
        visitor.visit(programContext);

    }
}
