package site;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import site.model.Capitulo;
import site.service.CapituloService;

@Controller
public class SiteController {
    private final CapituloService capituloService;

    public SiteController(CapituloService capituloService) {
        this.capituloService = capituloService;
    }
    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("nome", "Fabi");
        model.addAttribute("capitulos", capituloService.listarTodos());

        return "index";
    }

    @GetMapping("/capitulo/{slug}")
    public String capitulo(
            @PathVariable String slug,
            Model model) {

        Capitulo capitulo = capituloService.buscarPorSlug(slug);

        if (capitulo == null) {
            return "redirect:/";
        }

        model.addAttribute("capitulo", capitulo);

        return "capitulo";
    }
}

