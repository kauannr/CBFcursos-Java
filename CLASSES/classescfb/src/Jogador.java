public class Jogador {

private int vidas_jogador;
private int maximo_vidas = 5;

 public Jogador(String nome, double altura, int idade){ //Construtor pra criar um jogador
    System.out.printf("Nome do jogador: %s\nAltura: %.2f\nIdade: %d\n", nome,altura,idade);
    
}
 public void setVidas(int vidas_jogador){ //Editar o numero de vidas do jogador
     if(vidas_jogador > maximo_vidas){
         System.out.printf("Numero de vidas excedido.\n");
         this.vidas_jogador = 5;
     }
     else if(vidas_jogador < 0){
         this.vidas_jogador = 0;
     } 
     else{
         this.vidas_jogador = vidas_jogador;
     }
 }

 public int getVidas(){ //Exibir o numero de vidas
    return this.vidas_jogador;
}
 public void adicionarVidas(){ //Adicionar +1 vida
     if(vidas_jogador<maximo_vidas){
         this.vidas_jogador++;
     }
     else{
         this.vidas_jogador = maximo_vidas;
     }
 }
}
