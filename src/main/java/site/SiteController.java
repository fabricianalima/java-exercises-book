package site;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("nome", "Fabi");

        List<String> capitulos = List.of(
                "Introdução ao Java",
                "Operadores",
                "Controle de Fluxo",
                "Collections",
                "Exceptions"
        );

        model.addAttribute("capitulos", capitulos);

        return "index";
    }
}