import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fatorial:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = scanner.nextInt(); //Obtendo numero a partir do teclado
        int resultado = 1; //Resultado recebe 1, pq se for 0, toda multiplicação vai ser 0

        for(int i=num; i>=1; i--){

            resultado = i * resultado;

        } System.out.printf("Resultado: %d", resultado);
    }
}
