package br.com.bandtec.darksouls;

public abstract class Classe implements Personagem {
    private String nome;
    private String dificuldade;
    private String descricao;
    private String arma;
    private Integer vigor;
    private Integer fortitude;
    private Integer vitalidade;
    private Integer forca;
    private Integer destreza;
    private Integer sorte;

    public Classe(String nome,
                  String dificuldade,
                  String descricao,
                  String arma,
                  Integer vigor,
                  Integer fortitude,
                  Integer vitalidade,
                  Integer forca,
                  Integer destreza,
                  Integer sorte) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.arma = arma;
        this.vigor = vigor;
        this.fortitude = fortitude;
        this.vitalidade = vitalidade;
        this.forca = forca;
        this.destreza = destreza;
        this.sorte = sorte;
    }

    public abstract Boolean isRecomendavelPvp();

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArma() {
        return arma;
    }

    public Integer getVigor() {
        return vigor;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public Integer getVitalidade() {
        return vitalidade;
    }

    public Integer getForca() {
        return forca;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public Integer getSorte() {
        return sorte;
    }
}
