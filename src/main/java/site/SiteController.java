package site;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.MarkdownService;
import site.model.Capitulo;

@Controller
public class SiteController {

    private final MarkdownService markdownService;

    public SiteController(MarkdownService markdownService) {
        this.markdownService = markdownService;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("nome", "Fabi");

        List<Capitulo> capitulos = List.of(
                new Capitulo(
                        "Introdução ao Java",
                        "Fundamentos da linguagem Java",
                        "/capitulo/introducao-java",
                        "introducao-java"
                ),
                new Capitulo(
                        "Operadores",
                        "Operadores aritméticos, relacionais e lógicos",
                        "/capitulo/operadores",
                        "operadores"
                ),
                new Capitulo(
                        "Controle de Fluxo",
                        "Condicionais e estruturas de repetição",
                        "/capitulo/controle-de-fluxos",
                        "controle-de-fluxos"
                ),
                new Capitulo(
                        "Collections",
                        "Estruturas para trabalhar com coleções de dados",
                        "/capitulo/collections",
                        "collections"
                ),
                new Capitulo(
                        "Exceptions",
                        "Tratamento de exceções em Java",
                        "/capitulo/exceptions",
                        "exceptions"
                )
        );


        model.addAttribute("capitulos", capitulos);

        return "index";
    }

    @GetMapping("/capitulo/{slug}")
    public String capitulo(
            @PathVariable String slug,
            Model model
    ) throws IOException {

        String html = markdownService.converter(slug + ".md");

        model.addAttribute("conteudo", html);

        return "capitulo";
    }
}
