package site;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import site.model.Capitulo;

@Controller
public class SiteController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("nome", "Fabi");

        List<Capitulo> capitulos = List.of(
                new Capitulo(
                        "Introdução ao Java",
                        "Fundamentos da linguagem Java",
                        "/introducao-java"
                ),
                new Capitulo(
                        "Operadores",
                        "Operadores aritméticos, relacionais e lógicos",
                        "/operadores"
                ),
                new Capitulo(
                        "Controle de Fluxo",
                        "Condicionais e estruturas de repetição",
                        "/controle-de-fluxo"
                ),
                new Capitulo(
                        "Collections",
                        "Estruturas para trabalhar com coleções de dados",
                        "/collections"
                ),
                new Capitulo(
                        "Exceptions",
                        "Tratamento de exceções em Java",
                        "/exceptions"
                )
        );

        model.addAttribute("capitulos", capitulos);

        return "index";
    }

    @GetMapping("/introducao-java")
    public String introducaoJava(Model model) {

        Capitulo capitulo = new Capitulo(
                "Introdução à Programação Java",
                "Fundamentos da linguagem Java",
                "/introducao-java"
        );

        model.addAttribute("capitulo", capitulo);

        return "introducao-java";
    }
}
