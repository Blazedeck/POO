public class TesteEscalacao {
    public static void main(String[] args) {
        
        Escalacao escalacao = new Escalacao();

        Time time = new Time();
        time.setNomeTime("Flamengo");
        
        Jogador jog1 = new Jogador();  //criar um objeto jog1 do tipo Jogador

        jog1.setNome("Raul");
        
        Jogador jog2 = new Jogador();
        
        jog2.setNome("Zico");
        
        Jogador jog3 = new Jogador();
        
        jog3.setNome("Junior");
        
        Jogador jog4 = new Jogador();
        
        jog4.setNome("Andrade");
        
        Jogador jog5 = new Jogador();
        
        jog5.setNome("Nunes");
        
        System.out.println("TIME: " + time.getNomeTime());
        System.out.println("---------------");
        jog1.imprimir();
        jog2.imprimir();
        jog3.imprimir();
        jog4.imprimir();
        jog5.imprimir();
    }
}
