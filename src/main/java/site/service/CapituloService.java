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

    public List<Capitulo> listarTodos() {
        return capitulos;
    }

    public Capitulo buscarPorSlug(String slug) {

        for (Capitulo capitulo : capitulos) {

            if (capitulo.getSlug().equals(slug)) {
                return capitulo;
            }
        }

        return null;
    }
}