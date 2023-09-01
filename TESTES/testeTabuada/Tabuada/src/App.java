import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tabuada:");

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Numero da tabuada: ");
        int num_tabuada = Scanner.nextInt();//Numero da tabuada a partir do teclado.
        

        for(int i = 0; i<=10; i++){
            System.out.printf("%d x %d = %d\n", num_tabuada , i , (num_tabuada*i));
        }
    }
}
