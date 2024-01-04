package src.ifg.atvCampeonato;

public class Arbitro extends Pessoa {
    private String funcao;
    private String federacao;

    public Arbitro(String nome, String cpf, char sexo, String funcao, String federacao) {
        super(nome, cpf, sexo);
        this.funcao = funcao;
        this.federacao = federacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFederacao() {
        return federacao;
    }

    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }

    
}