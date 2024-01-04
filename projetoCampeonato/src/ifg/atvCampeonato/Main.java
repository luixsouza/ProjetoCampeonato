package src.ifg.atvCampeonato;

public class Main {
    public static void main(String[] args) {
        
        // Criando arbitro
        Arbitro arbitro = new Arbitro("Anderson Daronco", "1234567890", 'M', "Árbitro principal", "CBF");

        // Técnicos das equipes
        Tecnico tecnicoEquipe1 = new Tecnico("Diego Aguirre", "1111222233", 'M', "Técnico", "Santos");
        Tecnico tecnicoEquipe2 = new Tecnico("Abel Ferreira", "4444555566", 'M', "Técnico", "Palmeiras");
        


        // Jogadores Santos
        Jogador jogador1 = new Jogador("João Paulo", "1111222233", 'M', 1, "Goleiro", true);
        Jogador jogador2 = new Jogador("Júnior Caiçara", "4444555566", 'M', 2, "Defensor", true);
        Jogador jogador3 = new Jogador("João Basso", "7777888899", 'M', 3, "Meio-campista", true);
        Jogador jogador4 = new Jogador("Messias", "1011121314", 'M', 4, "Defensor", true);
        Jogador jogador5 = new Jogador("Dodô", "1516171819", 'M', 5, "Defensor", true);
        Jogador jogador6 = new Jogador("Rodrigo Fernández", "2021222324", 'M', 6, "Meio-campista", true);
        Jogador jogador7 = new Jogador("Jean Lucas", "2526272829", 'M', 7, "Meio-campista", true);
        Jogador jogador8 = new Jogador("Nonato", "3031323334", 'M', 8, "Meio-campista", true);
        Jogador jogador9 = new Jogador("Lucas Braga", "3536373839", 'M', 9, "Atacante", true);
        Jogador jogador10 = new Jogador("Marcos Leonardo", "4041424344", 'M', 10, "Atacante", true);
        Jogador jogador11 = new Jogador("Mendoza", "4546474849", 'M', 11, "Atacante", true);

        // Jogadores reservas Santos
        Jogador jogadorReserva1 = new Jogador("Vladimir", "15548785214", 'M', 12, "Goleiro", false);
        Jogador jogadorReserva2 = new Jogador("João Lucas", "96584712456", 'M', 13, "Lateral Direito", false);
        Jogador jogadorReserva3 = new Jogador("Joaquim", "02548756241", 'M', 28, "Zagueiro", false);
        Jogador jogadorReserva4 = new Jogador("Kevyson", "65487521344", 'M', 38, "Lateral Esquerdo", false);
        Jogador jogadorReserva5 = new Jogador("Dodi", "25487965412", 'M', 19, "Volante", false);


        // Jogadores Palmeiras
        Jogador jogador12 = new Jogador("Weverton", "5555666677", 'M', 1, "Goleiro", true);
        Jogador jogador13 = new Jogador("Marcos Rocha", "8888999900", 'M', 2, "Defensor", true);
        Jogador jogador14 = new Jogador("Luan", "9999000011", 'M', 3, "Defensor", true);
        Jogador jogador15 = new Jogador("Gustavo Gómez", "1011121314", 'M', 4, "Defensor", true);
        Jogador jogador16 = new Jogador("Piquerez", "1415161718", 'M', 5, "Defensor", true);
        Jogador jogador17 = new Jogador("Zé Rafael", "1819202122", 'M', 6, "Meio-campista", true);
        Jogador jogador18 = new Jogador("Gabriel Menino", "2223242526", 'M', 7, "Meio-campista", true);
        Jogador jogador19 = new Jogador("Raphael Veiga", "2627282930", 'M', 8, "Meio-campista", true);
        Jogador jogador20 = new Jogador("Mayke", "3031323334", 'M', 9, "Defensor", true);
        Jogador jogador21 = new Jogador("Artur", "3435363738", 'M', 10, "Atacante", true);
        Jogador jogador22 = new Jogador("Rony", "3839404142", 'M', 11, "Atacante", true);

        // Jogadores reservas Palmeiras
        Jogador jogadorReserva6 = new Jogador("Marcelo Lombra", "938475647382", 'M', 12, "Goleiro", false);
        Jogador jogadorReserva7 = new Jogador("Endrick", "83762546579", 'M', 69, "Atacante", false);
        Jogador jogadorReserva8 = new Jogador("Breno Lopes", "84756295747", 'M', 65, "Meio-campista", false);
        Jogador jogadorReserva9 = new Jogador("Richard", "9554641578", 'M', 16, "Meio-campista", false);
        Jogador jogadorReserva10 = new Jogador("Jhonatan", "2145477846", 'M', 14, "Atacante", false);


        // Arrays de jogadores
        Jogador[] jogadoresEquipe1 = {jogador1, jogador2, jogador3, jogador4, jogador5, jogador6, jogador7, jogador8, jogador9, jogador10, jogador11};
        Jogador[] jogadoresEquipe2 = {jogador12, jogador13, jogador14, jogador15, jogador16, jogador17, jogador18, jogador19, jogador20, jogador21, jogador22};

        Jogador[] reservasEquipe1 = {jogadorReserva1, jogadorReserva2, jogadorReserva3, jogadorReserva4, jogadorReserva5};
        Jogador[] reservasEquipe2 = {jogadorReserva6, jogadorReserva7, jogadorReserva8, jogadorReserva9, jogadorReserva10};

        // Criando equipes
        Equipe equipe1 = new Equipe("Santos", 20, jogadoresEquipe1, reservasEquipe1);
        Equipe equipe2 = new Equipe("Palmeiras", 15, jogadoresEquipe2, reservasEquipe2);
        
        equipe1.adicionarReservas(reservasEquipe1);
        equipe2.adicionarReservas(reservasEquipe2);

        // Setando tecnicos das equipes
        equipe1.setTecnico(tecnicoEquipe1);
        equipe2.setTecnico(tecnicoEquipe2);


        // Campeonato com as Equipes
        Equipe[] equipesCampeonato = {equipe1, equipe2};
        Campeonato campeonato1 = new Campeonato("Brasileirão", equipesCampeonato, new Rodada[]{}, "Primeira Divisão");

        // Jogos da rodada
        Jogo jogo1 = new Jogo(equipe1, equipe2, "2023-09-15", "20:00", "Estádio Urbano Caldeira (Vila Belmiro)", arbitro);
        

        jogo1.realizarRodada();

        // Imprimindo informações
        System.out.println("\nInformações do Campeonato:");
        System.out.println("Nome do Campeonato: " + campeonato1.getNome());
        System.out.println("Divisão: " + campeonato1.getDivisao());
        System.out.println("Equipes do Campeonato: ");
        for (Equipe equipe : campeonato1.getEquipes()) {
            System.out.println("Nome da Equipe: " + equipe.getNome());
        }

        System.out.println("\nInformações da Rodada:");
        System.out.println("Data: " + jogo1.getData());
        System.out.println("Horário: " + jogo1.getHora());
        System.out.println("Estádio: " + jogo1.getLocal());
        System.out.println("Árbitro: " + jogo1.getArbitro().getNome());
        System.out.println("Times em campo: " + jogo1.getEquipe1().getNome() + " x " + jogo1.getEquipe2().getNome());
        
        System.out.println("\nEscalação Titular do " + equipe1.getNome() + ":");
        listarEscalação(equipe1.getJogadores());

        System.out.println("\nEscalação Reserva do " + equipe1.getNome() + ":");
        listarEscalação(equipe1.getJogadoresReservas());

        System.out.println("\nEscalação Titular do " + equipe2.getNome() + ":");
        listarEscalação(equipe2.getJogadores());

        System.out.println("\nEscalação Reserva do " + equipe2.getNome() + ":");
        listarEscalação(equipe2.getJogadoresReservas());

        System.out.println("\nTécnicos das Equipes:");
        listarTecnicos(new Tecnico[]{tecnicoEquipe1, tecnicoEquipe2});



        // Exibir o resultado da rodada
        System.out.println("\nResultado da Rodada:");
        System.out.println(jogo1.getEquipe1().getNome() + " " + jogo1.getPlacarEquipe1() + " x " + jogo1.getPlacarEquipe2() + " " + jogo1.getEquipe2().getNome());
    }

       // Listando as escalações dos times
    private static void listarEscalação(Jogador[] jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome() + ", Número: " + jogador.getNumeroCamiseta() + ", Posição: " + jogador.getPosicao());
        }
    }

    private static void listarTecnicos(Tecnico[] tecnicos) {
        for (Tecnico tecnico : tecnicos) {
            System.out.println("Técnico do " + tecnico.getEquipe() + ": " + tecnico.getNome());
        }
    }

   
}
    
    


