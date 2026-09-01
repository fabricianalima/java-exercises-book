package site;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class SiteGenerator {

    public static void main(String[] args) {

        String nome = "Maria";

        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();

        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);

        Context context = new Context();
        context.setVariable("nome", nome);

        String resultado = templateEngine.process("index", context);

        System.out.println(resultado);
    }
}