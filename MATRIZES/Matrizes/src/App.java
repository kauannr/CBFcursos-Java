import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Matrizes");
    int linha = 3;
    int coluna = 5;
    int [][] matriz = new int [linha][coluna]; //Matriz criada com numero de linhas e colunas.
    Scanner scan = new Scanner(System.in); //Scanner criado pra preencher a matriz a partir do teclado.

     for(int l=0; l<linha; l++){
        for(int c=0; c<coluna; c++){
            System.out.printf("\nPreencha o array %d - %d: ", l,c);
            matriz[l][c] = scan.nextInt(); //Preenchendo o array.
        }
      }
      System.out.println("Matriz preenchida:");
      for(int l=0; l<linha; l++){
          for(int c=0; c<coluna; c++){
            System.out.printf("%2d / ",matriz[l][c]); //Exibindo a matriz preenchida.
          }
          System.out.println(""); //Espaçamento para organização.
      }
 }
}
