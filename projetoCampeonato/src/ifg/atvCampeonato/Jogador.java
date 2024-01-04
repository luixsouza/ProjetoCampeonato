package src.ifg.atvCampeonato;

public class Jogador {
    private String nome;
    private String cpf;
    private char sexo;
    private int numeroCamiseta;
    private String posicao;
    private boolean titular;

    
    public Jogador(String nome, String cpf, char sexo, int numeroCamiseta, String posicao, boolean titular) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.numeroCamiseta = numeroCamiseta;
        this.posicao = posicao;
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPosicao() {
        return posicao;
    }

    public boolean isTitular() {
        return titular;
    }

}
