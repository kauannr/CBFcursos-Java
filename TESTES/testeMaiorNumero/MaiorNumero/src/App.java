import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste: Maior Numero");

        Scanner scan = new Scanner(System.in);
        int numero, maior_numero = 0;
        int cont = 0;

        do{
            numero = scan.nextInt();
            
            if(numero>maior_numero){
                maior_numero = numero;
            }
        cont++;
        }while(cont<5);
        System.out.println("Maior numero: " + maior_numero);

    }
}