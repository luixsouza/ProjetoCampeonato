package src.ifg.atvCampeonato;

public class Tecnico extends Pessoa {
    private String funcao;
    private String equipe;

    public Tecnico(String nome, String cpf, char sexo, String funcao, String equipe) {
        super(nome, cpf, sexo);
        this.funcao = funcao;
        this.equipe = equipe;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEquipe() {
        return equipe;
    }

}
