import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criando Calculadora");
        Scanner scan = new Scanner(System.in); //Scanner criado.

        numero n1 = new numero(); //Objetos criados
        numero n2 = new numero();
        numero result = new numero();
        String opcao = "sim"; //Opção pra fazer o loop
        
        while( opcao.equals("sim") ){
        System.out.printf("\nDigite o numero 1: ");
        n1.setNum(scan.nextInt()); //Digitando n1 a partir do teclado

        System.out.printf("\nDigite o numero 2: ");
        n2.setNum(scan.nextInt()); //Digitando n2 a partir do teclado

        result.setNum( n1.getNum() + n2.getNum() ); 
        System.out.printf("\nSoma dos números: %d", result.getNum() );

        result.setNum( n1.getNum() - n2.getNum() );
        System.out.printf("\nDimiuição dos números: %d", result.getNum() );

        result.setNum( n1.getNum() * n2.getNum() );
        System.out.printf("\nMultiplicação dos números: %d", result.getNum() );
        System.out.printf("\nOutros numéros?: ");
        opcao=scan.next(); 

            if(opcao.equals("nao")){
                System.out.println("Fim do programa");
                break;
            } }
    }
}
