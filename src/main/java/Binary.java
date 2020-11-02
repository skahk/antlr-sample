import binary.BinaryLexer;
import binary.BinaryParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Binary {

    public static void main(String[] args) {

        // Antlr cheatsheet: https://theantlrguy.atlassian.net/wiki/spaces/ANTLR3/pages/2687036/ANTLR+Cheat+Sheet

        BinaryLexer lexer = new BinaryLexer(CharStreams.fromString("101"));
        BinaryParser parser = new BinaryParser(new CommonTokenStream(lexer));

        String name = parser.expression().getText();
        System.out.println(name);

    }

}
