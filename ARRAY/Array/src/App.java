import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Arrays.\n");

        int [] num = new int[5]; //Declarei o erray.
        //Mostrando de forma manual.
        num[0] = 5;
        num[1] = 10;
        num[2] = 15;
        num[3] = 20;
        num[4] = 25;
        System.out.println("Primeiro Array: Imprimindo o 3o numero: " + num[2]);
        

        //Mostrando de forma automatica
        
        int [] num2 = new int[5];
        num2[0] = 10;
        num2[1] = 20;
        num2[2] = 30;
        num2[3] = 40;
        num2[4] = 101010;
        System.out.println("Array 2:");
        for(int i=0; i<num2.length; i++){ //'num2.length' retorna o tamanho do array
        
            System.out.printf("[%d] -- %d\n",i,num2[i]);
        }
        
        //Criando um gabarito.
        int tam_questoes = 5;
        char [] respostas_corretas = {'a','c','d','b','c'};
        char [] respostas_aluno = {'b','c','d','a','c'};
        int nota = 0;

        for(int i=0; i<tam_questoes; i++){
            if(respostas_aluno[i] == respostas_corretas[i]){
                nota = nota + 2;
            }
        } System.out.printf("Nota do aluno: %d\n" , nota);

        System.out.print("Respostas corretas: ");
        for(int i=0; i<tam_questoes; i++){
            if(respostas_aluno[i] == respostas_corretas[i]){
                System.out.printf("%d ",i);
            }
        }

        //Criando um gabarito obtendo dados do teclado.
        Scanner scan = new Scanner(System.in); //Scanner criado.
        int nota2 = 0;
        char [] respostas_corretas2 = {'a','c','d','b','c'};
        char [] respostas_aluno2 = new char[5];

        for(int i=0; i<5; i++){
            System.out.printf("Informe a resposta da questão %d: ", i);
            respostas_aluno2[i] = scan.next().charAt(0); //Obtendo do teclado

             if(respostas_aluno2[i]==respostas_corretas2[i]
             ){
                 nota2 = nota2 + 2;
             } 
        }System.out.printf("Sua nota foi: %d", nota2);

    }     
}
