package site.model;


public class Capitulo {

    private String nome;
    private String descricao;
    private String url;
    private String slug;

    public Capitulo(String nome, String descricao, String url, String slug) {
        this.nome = nome;
        this.descricao = descricao;
        this.url = url;
        this.slug = slug;
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

    public String getSlug() {
        return slug;
    }
}
