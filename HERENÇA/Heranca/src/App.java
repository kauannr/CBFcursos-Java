public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Herença em Java");
        Carro c1 = new Carro("Golf");
        c1.setLigado(true);
        c1.info();

        CarroCombate c2 = new CarroCombate("Leopardo", 100);
        c2.setqnt_armamento(100);
        c2.info();
    }
}
