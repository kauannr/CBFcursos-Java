import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos da classe array");
/*Funções da classe arrays:
Função Arrays.sort: organizar o array de forma crescente
Função Arrays.fill: preencher um array
Função System.arraycopy: copiar um array para o outro
Função Arrays.equals: retorna um booleano informando se são iguais
Função Arrays.binarySearch: procurar um valor no array*/

        //Arrays.sort:
        System.out.println("Arrays.sort(Ordenar):");
        int [] array_teste = {20,10,30,50,40}; //Criando o array
        Arrays.sort(array_teste);  //Ordenando o array
        for(int i=0; i<array_teste.length; i++){
            System.out.printf("%d - %d\n",i,array_teste[i]);
        }

        //Arrayfill:
        System.out.println("\nArrays.fill(Preencher):");
        int [] array_teste2 = {20,10,30,50,40};//Criando o array
        Arrays.fill(array_teste2, 20);  //Pegando o array_teste2 e preenchendo com o valor 20
        for(int i=0; i<array_teste2.length; i++){
            System.out.printf("%d - ", array_teste2[i]);
        }

        //System.arraycopy
        System.out.println("\nSystem.arrayscopy(Copiar um para o outro):");
        int [] array_teste3 = {20,10,30,50,40};//Criando o array
        int [] array_xerox = new int[array_teste3.length];
        System.arraycopy(array_teste3, 0, array_xerox, 0, array_teste3.length);
        System.out.println("\nArray copiado:");
        for(int i=0; i<array_teste3.length; i++){
            System.out.printf("%d - ", array_xerox[i]);
        }
        //Arrays.equals
       if(Arrays.equals(array_teste, array_xerox)==true){
           System.out.println("\nArrays iguais!");
       } else{
           System.out.println("\nArrays não são iguais!");
        }
        //BinarySearch
        int n = 10;
        Arrays.sort(array_teste);
        if(Arrays.binarySearch(array_teste, n)>=0){
            System.out.printf("Numero encontrado na posição %d" , array_teste);
        }
        else{
            System.out.println("Teste falso");
        }
    }
}