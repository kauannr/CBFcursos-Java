import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula HashSet");

        HashSet<String> carros = new HashSet<>();

        //Adicionando carros a lista (sem repetição)
        carros.add("Celta");
        carros.add("Ka");        
        carros.add("Polo");        
        carros.add("Uno");        
        carros.add("Onix");        
        carros.add("Evoque");
        //Imprimindo lista
        System.out.println(carros);

        //Adicionando carro que já existe
        System.out.println(carros.add("Celta") ? "Adicionado\n" : "Já existe\n");

        //Checando se na lista contém um Polo
        System.out.println(carros.contains("Polo") ? "Contém\n" : "Não contém\n");

        //Maior numero(caso não fosse de string)
        System.out.println(Collections.max(carros));
        //Menor numero
        System.out.println(Collections.min(carros));
        //...//
        HashSet<Double> numeros = new HashSet<>(Arrays.asList(10d,8d,6d,5d,4d, 4d));
        System.out.println(numeros);

        //Set<String> carros2 = new TreeSet<>(carros);
    }
}
