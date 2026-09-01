package site;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
                        "/introducao-java",
                        "introducao-java"
                ),
                new Capitulo(
                        "Operadores",
                        "Operadores aritméticos, relacionais e lógicos",
                        "/operadores",
                        "operadores"

                ),
                new Capitulo(
                        "Controle de Fluxo",
                        "Condicionais e estruturas de repetição",
                        "/controle-de-fluxo",
                        "controle-de-fluxo"
                ),
                new Capitulo(
                        "Collections",
                        "Estruturas para trabalhar com coleções de dados",
                        "/collections",
                        "collections"
                ),
                new Capitulo(
                        "Exceptions",
                        "Tratamento de exceções em Java",
                        "/exceptions",
                        "exceptions"
                )
        );

        model.addAttribute("capitulos", capitulos);

        return "index";
    }
/*
    @GetMapping("/capitulo/{slug}")
    public String capitulo(@PathVariable String slug, Model model) {

        System.out.println("Capítulo solicitado: " + slug);

        model.addAttribute("slug", slug);

        return "capitulo";
    }
*/
    @GetMapping("/capitulo/{slug}")
    public String capitulo(@PathVariable String slug, Model model) {

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
                        "/capitulo/controle-de-fluxo",
                        "controle-de-fluxo"
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

        for (Capitulo capitulo : capitulos) {

            if (capitulo.getSlug().equals(slug)) {

                model.addAttribute("capitulo", capitulo);

                return "capitulo";
            }
        }

        return "redirect:/";
    }
}

