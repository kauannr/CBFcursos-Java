public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste 2: Herança");
        moto m1 = new moto("Ducati");
        m1.setMarchas(6);
        m1.setVel_maxima(200);
        m1.info();

        motoEquipada m2 = new motoEquipada("Suzuki");
        m2.info();
       
    }
}
