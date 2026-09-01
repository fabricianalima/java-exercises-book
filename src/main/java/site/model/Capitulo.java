package site.model;


public class Capitulo {

    private String nome;
    private String descricao;
    private String url;

    public Capitulo(String nome, String descricao, String url) {
        this.nome = nome;
        this.descricao = descricao;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }
}
