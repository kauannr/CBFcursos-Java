import java.util.Scanner;

public class App {

     public static int soma_de_2(int x,int y){ //Metodo Soma de dois numeros
        int resp = x + y;
        return resp;
    }
     public static int soma_indeterminada(int...numeros){ //Metodo Soma sem limite de numeros
        int res=0;
        for(int recipiente:numeros){
            res = res + recipiente;
        }
        return res;
    }
     public static double soma_indeterminada(double...numeros){ //Metodo Soma sem limite de numeros
        double res = 0;
        for(double recipiente:numeros){
            res = res + recipiente;
        }
        return res;
    }
    public static void main(String[] args) throws Exception { //MAIN PRINCIPAL
        System.out.println("Outra aula: Metodos");

        Scanner scan = new Scanner(System.in); //Scanner criado
        int res;
        res = soma_de_2(scan.nextInt(), scan.nextInt()); //Obtendo numeros do teclado e somando
        System.out.println(res); //Imprimindo o resultado da soma
        //Ou...
        System.out.println(soma_de_2(40, 40)); //Print primeiro metodo

        System.out.println("Soma Total: " + soma_indeterminada(10,10,10,20,20)); //Print segundo metodo

        System.out.println("Soma Total: " + soma_indeterminada(10.4,10.5)); //Print terceiro metodo
        


    }

}
