public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Metodos e atributos static");

        Jogo j1 = new Jogo(1);
        Jogo j2 = new Jogo(2);
        Jogo j3 = new Jogo(3);
        
        Jogo.tipo = "Duelista";
        Jogo.pontos();//Adicionando pontos ao jogador
        Jogo.pontos();

        j1.info();//Exebindo informações do jogador1
    }
}
