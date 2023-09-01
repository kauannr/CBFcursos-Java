public class complemento extends registro{
    private double rg;
    public complemento(int rg){
        super("Kauan", "Teca", 20, 709126064);
        this.rg = rg;
    }
    public void info(){
        super.info();
        System.out.printf("RG: %.0f", rg);
    }
}
