package src.ifg.atvCampeonato;

public class Equipe {
    private String nome;
    private int pontuacao;
    private Jogador[] jogadores;
    private Jogador[] jogadoresReservas;

    public Equipe(String nome, int pontuacao, Jogador[] jogadores, Jogador[] jogadoresReservas) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.jogadores = jogadores;
        this.jogadoresReservas = jogadoresReservas;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setTecnico(Tecnico tecnicoEquipe1) {
    }

    public Tecnico getTecnico() {
        return null;
    }

    public void adicionarReservas(Jogador[] reservasEquipe1) {
    }
    

    public Jogador[] getJogadoresReservas() {
        return jogadoresReservas;
    }


}
