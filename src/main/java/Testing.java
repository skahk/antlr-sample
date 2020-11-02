import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import testing.TestLexer;
import testing.TestParser;

public class Testing {
    public static void main(String[] args) {

        // Antlr cheatsheet: https://theantlrguy.atlassian.net/wiki/spaces/ANTLR3/pages/2687036/ANTLR+Cheat+Sheet

        TestLexer lexer = new TestLexer(CharStreams.fromString("Hello John!"));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();
        System.out.println(name);
    }
}
