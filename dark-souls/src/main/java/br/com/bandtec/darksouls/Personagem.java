package br.com.bandtec.darksouls;

// aqui, utilizei interface pois ambas as classes Classe e Despojado utilizam os mesmos metodos
public interface Personagem {
    public Integer calcSoulLevel();
    public String getNome();
}
