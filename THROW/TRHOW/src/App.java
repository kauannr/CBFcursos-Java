import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Throw: Lançando uma exceção");

        System.out.println("Digite dois numeros para serem multiplicados. obs: numeros abaixo de 100");
        double n1, n2, result;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("n1: ");
        n1 = scanner.nextInt();

        System.out.println("n2: ");
        n2 = scanner.nextInt();

        if(n1>100){
            throw new IllegalArgumentException("Erro: Numero 1 maior que 100");
        }
        if(n2>100){
            throw new IllegalArgumentException("Erro: Numero 2 maior que 100");
        }else{
            result = n1 * n2;
            System.out.println("Resultado: " + result);
        }
    }
}
