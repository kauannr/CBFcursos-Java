public class CarroCombate extends Carro {

    private int maxArmamento = 100;
    private int minArmamento = 0;
    private int qnt_Armamento;

    public CarroCombate(String nome, int blindagem) {
        super(nome);
        super.setLigado(true);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qnt_Armamento = 0;

    }

    public void setqnt_armamento(int qnt_Armamento) {
        this.qnt_Armamento = this.qnt_Armamento + qnt_Armamento;
        if (this.qnt_Armamento > maxArmamento) {
            this.qnt_Armamento = maxArmamento;
        }
        if (this.qnt_Armamento < minArmamento) {
            this.qnt_Armamento = minArmamento;
        }
    }

    public void atirar() {
        if (this.qnt_Armamento > minArmamento) {
            System.out.println("Tiro disparado");
            setqnt_armamento(-1);
        } else {
            System.out.println("Sem armamentos");
        }
    }

    public void info() {
        super.info();
        System.out.printf("Quantidade de armamento: %d\n", this.qnt_Armamento);
    }
}
