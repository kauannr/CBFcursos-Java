import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste consoantes");
        Scanner scanner = new Scanner(System.in);

        String[] letras = new String[6];
        String[] consoantes = new String[6];
        int qnt_consoantes = 0;

        for(int i=0; i<6; i++){
            letras[i]=scanner.next();
          if( !(letras[i].equalsIgnoreCase("a") | 
                letras[i].equalsIgnoreCase("e") |    
                letras[i].equalsIgnoreCase("i") |    //Se for diferente das vogais, são consoantes  
                letras[i].equalsIgnoreCase("o") | 
                letras[i].equalsIgnoreCase("u") ) )  {
                    qnt_consoantes++;
                    consoantes[i] = letras[i]; //recebe as letras que são consoantes
                }
           }  System.out.println("Quantidade de consoantes: " + qnt_consoantes);
       
        for (String n : consoantes) {
            if(n!=null){
                System.out.println(n); //Imprimindo quais foram elas
            }
        }
    }
}
