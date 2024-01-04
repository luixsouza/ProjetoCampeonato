package src.ifg.atvCampeonato;

public class Rodada {
    private String nome;
    private Jogo[] jogos;

    public Rodada(String nome, Jogo[] jogos) {
        this.nome = nome;
        this.jogos = jogos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogo[] getJogos() {
        return jogos;
    }

    public void setJogos(Jogo[] jogos) {
        this.jogos = jogos;
    }

}
