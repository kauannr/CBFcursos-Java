public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interfaces/ Classes abstratas");
       
        Gato gato = new Gato(10, 10);
        Cachorro cachorro = new Cachorro(20, 20);

        gato.setVivo(true);
        gato.info();
        gato.comer(10);
        
        cachorro.setVivo(true);
        cachorro.atacar(gato);

    }
}
