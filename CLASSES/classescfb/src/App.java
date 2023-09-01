public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Classes");
        Jogador jogador1 = new Jogador("Kauan", 1.83, 20); //Objeto criado,e parametros definidos
        jogador1.setVidas(5); //Atribuindo 3 vidas ao jogador
        System.out.println(jogador1.getVidas());//Exibindo as vidas

        jogador1.adicionarVidas();//Atribuindo +1 vida
        System.out.println(jogador1.getVidas());//Exibindo depois da atribuição
    }
}
