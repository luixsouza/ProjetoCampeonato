package src.ifg.atvCampeonato;

public class Campeonato {
    private String nome;
    private Equipe[] equipes;
    private Rodada[] rodadas;
    private String divisao;

    public Campeonato(String nome, Equipe[] equipes, Rodada[] rodadas, String divisao) {
        this.nome = nome;
        this.equipes = equipes;
        this.rodadas = rodadas;
        this.divisao = divisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe[] getEquipes() {
        return equipes;
    }

    public void setEquipes(Equipe[] equipes) {
        this.equipes = equipes;
    }

    public Rodada[] getRodadas() {
        return rodadas;
    }

    public void setRodadas(Rodada[] rodadas) {
        this.rodadas = rodadas;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

}
