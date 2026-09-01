package site;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Service;
import site.JavaCodeService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class MarkdownService {

    private final Parser parser = Parser.builder().build();
    private final HtmlRenderer renderer = HtmlRenderer.builder().build();

    private final JavaCodeService javaCodeService;

    public MarkdownService(JavaCodeService javaCodeService) {
        this.javaCodeService = javaCodeService;
    }

    public String converter(String nomeArquivo) throws IOException {

        Path caminho = Path.of(
                "src/main/resources/content",
                nomeArquivo
        );

        String markdown = Files.readString(caminho);

        String markdownComCodigo = adicionarCodigoJava(markdown);

        Node document = parser.parse(markdownComCodigo);

        return renderer.render(document);
    }

    private String adicionarCodigoJava(String markdown) throws IOException {

        String marcadorInicio = "{{java:";
        String marcadorFim = "}}";

        int inicio = markdown.indexOf(marcadorInicio);

        while (inicio != -1) {

            int fim = markdown.indexOf(marcadorFim, inicio);

            if (fim == -1) {
                break;
            }

            String nomeArquivo = markdown.substring(
                    inicio + marcadorInicio.length(),
                    fim
            );

            String codigo = javaCodeService.lerCodigo(nomeArquivo);

            String blocoCodigo = "```java\n"
                    + codigo
                    + "\n```";

            markdown = markdown.substring(0, inicio)
                    + blocoCodigo
                    + markdown.substring(fim + marcadorFim.length());

            inicio = markdown.indexOf(marcadorInicio);
        }

        return markdown;
    }
}