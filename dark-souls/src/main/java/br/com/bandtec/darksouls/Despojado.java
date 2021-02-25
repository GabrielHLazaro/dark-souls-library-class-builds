package br.com.bandtec.darksouls;

public class Despojado implements Personagem{
    private String nome;
    private String dificuldade;
    private String descricao;
    private Integer atributosFocados;

    public Despojado(String nome, String dificuldade, String descricao, Integer atributosFocados) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.atributosFocados = atributosFocados;
    }

    @Override
    public Integer calcSoulLevel() {
        return 5 + atributosFocados;
    }

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getAtributosFocados() {
        return atributosFocados;
    }
}
