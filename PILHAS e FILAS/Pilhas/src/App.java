import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: PILHAS e FILAS");
 /*PILHA - DEFINIÇÃO:
  * Como uma pilha de louças, roupas ou qualquer outra, um primeiro elemento adicionado
   na pilha fica sempre lá em baixo, assim como o ultimo adicionado fica sempre por cima 
 */
    //Criando e manipulando a pilha:
    Stack <String> jogadores = new Stack<>();
    System.out.println("Pilha...");
    jogadores.push("Cristiano Ronaldo");
    jogadores.push("Messi");
    jogadores.push("Neymar Jr");
    jogadores.push("Haaland");
    
    jogadores.pop();
    
    System.out.println(jogadores);

    
    System.out.println("Topo da pilha (Ultimo adicionado): " + jogadores.peek());
    System.out.println("Fim da pilha (Primeiro adicionado): " + jogadores.elementAt(0));
    
    System.out.print("Esta vazia?: ");
    System.out.println(jogadores.empty() ? "Pilha vazia" : "Pilha nao vazia");
    System.out.println("Item pesquisado está na posição: " + jogadores.search("Messi"));
    jogadores.clear();
    
    
/*FILA - DEFINIÇÃO:
  * Já na Fila, como em qualquer fila de banco ou coisa do tipo, o primeiro a
  entrar é também o primeiro a sair. O ultimo a entrar é o ultimo a sair. 
 */
    Queue <String> fila_do_banco = new ConcurrentLinkedQueue<>();
    System.out.println("\nFila...");
    fila_do_banco.add("Seu joão");
    fila_do_banco.add("Dona maria");
    fila_do_banco.add("Sebastião");
        System.out.println("Primeiro da fila: " + fila_do_banco.peek());
        System.out.println(fila_do_banco.poll() + " foi atendido, proximo da fila: " + 
        fila_do_banco.peek());
        System.out.println(fila_do_banco.poll() + " foi atendido, proximo da fila: " + 
        fila_do_banco.peek());
        
    }
}
