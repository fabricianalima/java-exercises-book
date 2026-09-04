package site.service;

import org.springframework.stereotype.Service;
import site.model.Capitulo;

import java.util.List;

@Service
public class CapituloService {

    private final List<Capitulo> capitulos = List.of(
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
                    "java-fundamentos/05-collections.md"
            ),
            new Capitulo(
                    "Exceptions",
                    "Tratamento de exceções em Java",
                    "/capitulo/exceptions",
                    "java-fundamentos/06-exceptions.md"
            )
    );

    public List<Capitulo> listarTodos() {
        return capitulos;
    }

    public Capitulo buscarPorUrl(String url) {

        for (Capitulo capitulo : capitulos) {

            if (capitulo.getUrl().equals(url)) {
                return capitulo;
            }
        }

        return null;
    }
}