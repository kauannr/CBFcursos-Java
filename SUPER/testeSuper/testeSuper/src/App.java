public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testenado o super\n");
        registro g1 = new registro("Kauan", "Teca", 20, 709126);
        g1.info();

        complemento c1 = new complemento(424);
        c1.info();
    }
}
