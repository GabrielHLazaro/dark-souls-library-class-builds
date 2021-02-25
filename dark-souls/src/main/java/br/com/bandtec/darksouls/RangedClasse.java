package br.com.bandtec.darksouls;

import java.util.ArrayList;
import java.util.List;

public class RangedClasse extends Classe{
    private Integer conhecimento;
    private Integer inteligencia;
    private Integer fe;
    private String canalizador;
    private List<String> magias;

    public RangedClasse(String nome, String dificuldade, String descricao, String arma,
                        Integer vigor, Integer fortitude, Integer vitalidade, Integer forca,
                        Integer destreza, Integer sorte, Integer conhecimento, Integer inteligencia,
                        Integer fe, String canalizador) {
        super(nome, dificuldade, descricao, arma, vigor, fortitude, vitalidade, forca, destreza, sorte);
        this.conhecimento = conhecimento;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.canalizador = canalizador;
        this.magias = new ArrayList<>();
    }

    @Override
    public Boolean isRecomendavelPvp() {
        Boolean recomendavel = true;
        if(getDificuldade().equals("iniciante") || getNome().equals("piromante")){
            recomendavel = false;
        }
        return recomendavel;
    }

    @Override
    public Integer calcSoulLevel() {
        return 8 + getVigor() + getFortitude() + getVitalidade() + getForca() + getDestreza() + getSorte();
    }

    public Integer getConhecimento() {
        return conhecimento;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public Integer getFe() {
        return fe;
    }

    public String getCanalizador() {
        return canalizador;
    }

    public List<String> getMagias() {
        return magias;
    }
}
