package site;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


@Service
public class JavaCodeService {

    public String lerCodigo(String caminhoArquivo) throws IOException {

        Path caminho = Path.of(
                "src/main/java",
                caminhoArquivo
        );

        return Files.readString(caminho);
    }
}