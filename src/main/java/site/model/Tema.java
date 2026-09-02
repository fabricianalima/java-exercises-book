package site.model;

import java.util.List;

public class Tema {

    private String nome;
    private String descricao;
    private String icone;
    private List<Capitulo> capitulos;

    public Tema(String nome, String descricao, String icone, List<Capitulo> capitulos) {
        this.nome = nome;
        this.descricao = descricao;
        this.icone = icone;
        this.capitulos = capitulos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIcone() {
        return icone;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
}