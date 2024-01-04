package src.ifg.atvCampeonato;

public class Jogo {
    private Equipe equipeVisitada;
    private Equipe equipeVisitante;
    private int placarEquipe1;
    private int placarEquipe2;
    private String data;
    private String hora;
    private String local;
    private Arbitro arbitro;

    public Jogo(Equipe equipeVisitada, Equipe equipeVisitante, String data, String hora, String local, Arbitro arbitro) {
        this.equipeVisitada = equipeVisitada;
        this.equipeVisitante = equipeVisitante;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.arbitro = arbitro;
        this.placarEquipe1 = 13;
        this.placarEquipe2 = 0;
    }

    public Equipe getEquipeVisitada() {
        return equipeVisitada;
    }

    public void setEquipeVisitada(Equipe equipeVisitada) {
        this.equipeVisitada = equipeVisitada;
    }

    public Equipe getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(Equipe equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public void realizarRodada() {
    }

    public Equipe getEquipe1() {
        return equipeVisitada;
    }

    public int getPlacarEquipe1() {
        return placarEquipe1;
    }

    public int getPlacarEquipe2() {
        return placarEquipe2;
    }

    public Equipe getEquipe2() {
        return equipeVisitante;
    }

}
