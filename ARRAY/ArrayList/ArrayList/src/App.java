import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array List");

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(0, 70);
        numeros.add(0, 70);

        for (Integer n : numeros) {
            System.out.println(n);
        }
        System.out.println(numeros.contains(200));
        System.out.println("Numero de elementos: " + numeros.size());
        System.out.println("Numero 50 está na posição: " + numeros.indexOf(50));
        System.out.println("Na posição 4: " + numeros.get(4));
        System.out.println("Menor nota: " + Collections.min(numeros));
        System.out.println("Maior nota: " + Collections.max(numeros));

        // Soma dos numeros no array list:
        Iterator<Integer> iterator = numeros.iterator(); // iterator recebe o array list
        int soma = 0;
        while (iterator.hasNext()) {
            int cont = iterator.next(); // cont vai recebendo o iterator e os próximos
            soma = soma + cont; // somando
        }
        System.out.println("Soma da lista: " + soma);
        System.out.println("\n");

        // Usando a classe MOTOS
        System.out.println("Usando a lista Motos: ");
        List<Motos> minhasMotos = new ArrayList<>() {
            {
                add(new Motos("Kawazaki", 600d, 100d));
                add(new Motos("Yamaha", 350d, 3400));
                add(new Motos("Honda", 150d, 2000d));
            }
        };
        for (Motos motos : minhasMotos) {
            System.out.println(motos);
        }

        // Criando um COMPARATOR
        System.out.println("\nLista Motos em ordem crescente");
        Collections.sort(minhasMotos, new ComparatorMoto());
        for (Motos motos : minhasMotos) {
            System.out.println(motos);
        }

        System.out.println("\nLista Motos em ordem de cilindrada");
        Collections.sort(minhasMotos, new ComparatorCilindrada());
        for (Motos motos : minhasMotos) {
            System.out.println(motos);
        }

        System.out.println("\nLista Motos em ordem de Km");
        Collections.sort(minhasMotos, new ComparatorKm());
        for (Motos motos : minhasMotos) {
            System.out.println(motos);
        }
    }
}
