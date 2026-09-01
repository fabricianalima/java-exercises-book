package site;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownTest {

    public static void main(String[] args) {

        String markdown = """
                # Operadores

                Operadores são símbolos utilizados para realizar operações.

                ## Operadores aritméticos

                - `+` → soma
                - `-` → subtração
                - `*` → multiplicação
                """;

        Parser parser = Parser.builder().build();

        Node document = parser.parse(markdown);

        HtmlRenderer renderer = HtmlRenderer.builder().build();

        String html = renderer.render(document);

        System.out.println(html);
    }
}