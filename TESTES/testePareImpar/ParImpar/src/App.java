import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Par e Impar");

        System.out.print("Digite quantos numeros irá trabalhar: ");
        Scanner scan = new Scanner(System.in);
        int numeros;
        numeros = scan.nextInt(); //Obtendo com o teclado
        int n[] = new int[numeros]; //Array para usar no for
        int par = 0, impar = 0; //Contadores

            for(int i=0; i<numeros; i++){
                n[i] = scan.nextInt();
                if(n[i]%2==0){
                    par++;
                }else{
                    impar++;
                }
        } System.out.println("Pares: " + par);
          System.out.println("Pares: " + impar);
    }
}
