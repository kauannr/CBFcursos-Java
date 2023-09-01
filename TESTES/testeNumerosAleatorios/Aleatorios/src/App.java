import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste: Numeros aleatorios e seus sucessores");
        
        Random random = new Random();

        int[] array = new int[20];
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);            
            System.out.print(array[i] + ","); //Imprime separando por virgula
        }
         System.out.println("");
         System.out.println("Sucessores:");
        for (int i : array) {
            System.out.print((i+1) + ","); //Imprime separando por virgula
        }
    }
}
