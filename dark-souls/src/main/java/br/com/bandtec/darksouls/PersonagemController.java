package br.com.bandtec.darksouls;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    private List<Personagem> personagens = new ArrayList<>();

    public PersonagemController() {
        personagens.add(new Despojado("sl0", "profissional",
                "zerar o jogo sem colocar pontos no personagem", 0));

        personagens.add(new MeeleClasse("cavaleiro parrudo", "mediana",
                "classe de cavaleiro tanque, focada em força e defesa",
                "espada grande da fumaça", 30, 3, 30, 30, 2, 0,
                "espada grande", "armadura de cavaleiro negro"));

        personagens.add(new MeeleClasse("assassino dex", "alta",
                "classe focada em inflingir sangramento", "murakumo",
                2, 7, 2, 5, 40, 40, "espada curva",
                "túnicas do ladrão"));

        personagens.add(new MeeleClasse("big bonk", "mediana",
                "classe de arma pesada, focada em esmagar os inimigos e aguentar ataques",
                "dente de dragão", 30, 2, 35, 40, 0, 0,
                "arma pesada", "armadura de catarina"));

        personagens.add(new MeeleClasse("cavaleiro basico", "iniciante",
                "cavaleiro padrão, classe perfeita para novos jogadores", "espada reta de astora",
                20, 10, 15, 45, 10, 0, "espada reta", "qualquer"));

        personagens.add(new RangedClasse("piromante", "iniciante",
                "a classe mais fácil de se jogar, com magias de fogo poderosas", "qualquer",
                20, 10, 10, 7, 35, 0, 30, 0, 0,
                "chama piromantica"));

        personagens.add(new RangedClasse("mago dex", "iniciante",
                "mago com feitiços poderosos e uma arma leve e rápida", "uchigatana",
                10, 15, 3, 6, 30, 0, 35, 45, 0,
                "canalizador de Logan"));

        personagens.add(new RangedClasse("paladino", "mediana", "cavaleiro com influencia em fé",
                "claymore divina", 30, 0, 35, 30, 8,0, 19,
                0, 30, "talisma de canvas"));
    }

    @GetMapping
    public List<Personagem> listarTodos() {
        return personagens;

    }

    @GetMapping("/classes")
    public List<Personagem> listarClasses(){
        List<Personagem> filtro = new ArrayList<>();
        for (Personagem p:personagens) {
            if (p instanceof Classe){
                filtro.add(p);
            }
        }
        return filtro;
    }

    @GetMapping("/classes/meeles")
    public List<Personagem> listarClassesMeele(){
        List<Personagem> filtro2 = new ArrayList<>();
        for (Personagem p:personagens) {
            if (p instanceof MeeleClasse){
                filtro2.add(p);
            }
        }
        return filtro2;
    }

    @GetMapping("/classes/rangeds")
    public List<Personagem> listarClassesRanged(){
        List<Personagem> filtro3 = new ArrayList<>();
        for (Personagem p:personagens) {
            if (p instanceof RangedClasse){
                filtro3.add(p);
            }
        }
        return filtro3;
    }

    @DeleteMapping("/{posicao}")
    public String excluirPersonagem(@PathVariable int posicao){
        if(posicao <= personagens.size()-1){
            personagens.remove(posicao -1);
            return "Build deletada com sucesso!";
        }
        else{
            return "Lamento, a build que você informou não existe.";
        }
    }

    @GetMapping("/{posicao}")
    public Personagem pesquisarPersonagemPosicao(@PathVariable int posicao){
        if(posicao -1< personagens.size()){
            return personagens.get(posicao - 1);
        }
        else {
            return null;
        }
    }

    @GetMapping("/{nome}")
    public List<Personagem> pesquisarPersonagemNome(@PathVariable String nome){
        return personagens.stream().filter(personagem ->
                personagem.getNome().contains(nome)).collect(Collectors.toList());
    }
}

