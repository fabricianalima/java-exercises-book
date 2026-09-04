package site;

import java.io.IOException;
import java.util.List;
import site.model.Tema;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.markdown.MarkdownService;
import site.model.Capitulo;
import site.service.CapituloService;

@Controller
public class SiteController {

    private final MarkdownService markdownService;
    private final CapituloService capituloService;

    public SiteController(MarkdownService markdownService, CapituloService capituloService) {
        this.markdownService = markdownService;
        this.capituloService = capituloService;
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
                                        "java-fundamentos/01-introducao-java.md"
                                ),
                                new Capitulo(
                                        "Variáveis e Tipos",
                                        "Variáveis e tipos primitivos do Java",
                                        "/capitulo/variaveis-e-tipos",
                                        "java-fundamentos/02-variaveis-e-tipos.md"
                                ),
                                new Capitulo(
                                        "livro-200-exercicios/Operadores",
                                        "Operadores aritméticos, relacionais e lógicos",
                                        "/capitulo/operadores",
                                        "java-fundamentos/03-operadores.md"
                                ),
                                new Capitulo(
                                        "Controle de Fluxo",
                                        "Condicionais e estruturas de repetição",
                                        "/capitulo/controle-de-fluxo",
                                        "java-fundamentos/04-controle-de-fluxo.md"
                                ),
                                new Capitulo(
                                        "Collections",
                                        "Estruturas para trabalhar com coleções de dados",
                                        "/capitulo/collections",
                                        "java-fundamentos/collections.md"
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

        String url = "/capitulo/" + slug;

        Capitulo capitulo = capituloService.buscarPorUrl(url);

        String html = markdownService.converter(
                capitulo.getArquivo()
        );

        model.addAttribute("conteudo", html);

        return "capitulo";
    }
}
