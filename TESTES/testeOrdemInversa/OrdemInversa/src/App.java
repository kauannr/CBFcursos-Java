public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste: Ordem inversa");
        int[] num = {1,2,3,4,5,6,7};

        for(int i=0; i<=6; i++){
            System.out.printf("%d-" ,num[i]);
        }

        System.out.println();//Espaçamento

        for(int i=6; i>=0; i--){
            System.out.printf("%d-" ,num[i]); //Imprime o vetor na posição de i
        }
    }
}
