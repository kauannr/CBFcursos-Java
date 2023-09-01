public class Jogo {

private int vidas_personagem = 1;
private String nome_personagem = "Yoru";
private int num;

 
private static int pontosJogadores = 0;
private static int qnt_jogadores = 0;
static String tipo;
static int kills;

    public Jogo(int num){ //Construtor
    this.num = num;
    System.out.printf("Jogador %d criado!\n\n", num);
    qnt_jogadores++;
}
    static void pontos(){ //Adicionar pontos globais
       pontosJogadores+=10;
       
    }

    public void info(){
    System.out.printf("Jogador: %s\n", nome_personagem);
    System.out.printf("Vidas: %d\n", vidas_personagem);
    System.out.printf("Tipo: %s\n", tipo);
    kills = 30;
    System.out.printf("Quantidade de kills: %d\n", kills);
    System.out.printf("Quantidade de jogadores criados: %d\n", qnt_jogadores);
    System.out.printf("Quantidade de pontos dos jogadores: %d\n", pontosJogadores);
    }
}
