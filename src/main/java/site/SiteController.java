package site;

import java.io.IOException;
import java.util.List;
import site.model.Tema;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.markdown.MarkdownService;
import site.markdown.MarkdownService;
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

        List<Tema> temas = List.of(

                new Tema(
                        "Java Fundamentos",
                        "Conceitos essenciais da linguagem Java",
                        "☕",
                        List.of(
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
                                        "/capitulo/controle-de-fluxo",
                                        "controle-de-fluxo"
                                ),
                                new Capitulo(
                                        "Collections",
                                        "Estruturas para trabalhar com coleções de dados",
                                        "/capitulo/collections",
                                        "collections"
                                )
                        )
                ),

                new Tema(
                        "Java POO",
                        "Programação orientada a objetos",
                        "🧩",
                        List.of(
                                new Capitulo(
                                        "Classes e Objetos",
                                        "Fundamentos da programação orientada a objetos",
                                        "/capitulo/classes-objetos",
                                        "classes-objetos"
                                ),
                                new Capitulo(
                                        "Encapsulamento",
                                        "Controle de acesso e proteção dos dados",
                                        "/capitulo/encapsulamento",
                                        "encapsulamento"
                                ),
                                new Capitulo(
                                        "Herança",
                                        "Reutilização de código através de herança",
                                        "/capitulo/heranca",
                                        "heranca"
                                ),
                                new Capitulo(
                                        "Polimorfismo",
                                        "Comportamentos diferentes para uma mesma interface",
                                        "/capitulo/polimorfismo",
                                        "polimorfismo"
                                )
                        )
                ),

                new Tema(
                        "Java + Spring Boot",
                        "Construção de aplicações backend com Spring Boot",
                        "🌱",
                        List.of()
                )
        );

        model.addAttribute("temas", temas);


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
