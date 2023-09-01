public class motoEquipada extends moto{
private boolean nitro;
private boolean scap_sportivo;
private boolean lentidao;
    public motoEquipada(String nome){
        super(nome);
        this.lentidao = true;
        this.nitro = true;
        this.scap_sportivo = true;
    }
    public void info(){
        super.setMarchas(8); //Chamando metodo da classe pai
        super.setVel_maxima(350); //Chamando metodo da classe pai
        super.info(); //Chamando metodo da classe pai
        
        System.out.printf("Nitro: %s\n" ,(this.nitro ? "Sim" : "Não"));
        System.out.printf("Lentidão: %s\n" ,(this.lentidao ? "Sim" : "Não"));
        System.out.printf("Escapamento Sportivo: %s\n" ,(this.scap_sportivo ? "Sim" : "Não"));
    }
}
