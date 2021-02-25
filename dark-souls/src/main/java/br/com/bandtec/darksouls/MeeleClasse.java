package br.com.bandtec.darksouls;

public class MeeleClasse extends Classe{
    private String tipoArma;
    private String armadura;

    public MeeleClasse(String nome, String dificuldade, String descricao, String arma,
                       Integer vigor, Integer fortitude, Integer vitalidade, Integer forca,
                       Integer destreza, Integer sorte, String tipoArma, String armadura) {
        super(nome, dificuldade, descricao, arma, vigor, fortitude, vitalidade, forca, destreza, sorte);
        this.tipoArma = tipoArma;
        this.armadura = armadura;
    }

    @Override
    public Boolean isRecomendavelPvp() {
        Boolean recomendavel = true;
        if (getDificuldade().equals("iniciante")){
            recomendavel = false;
        }
        return recomendavel;
    }

    @Override
    public Integer calcSoulLevel() {
        return 10 + getVigor() + getFortitude() + getVitalidade() + getForca() + getDestreza() + getSorte();
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public String getArmadura() {
        return armadura;
    }

    public Integer getSoulLevel(){
        return calcSoulLevel();
    }
}
