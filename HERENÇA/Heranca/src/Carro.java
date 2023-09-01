public class Carro {

    private String nome;
    private boolean ligado;
    private boolean destruido;
    private int blindagem;
    private boolean armamento;

    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public boolean isArmamento() {
        return armamento;
    }

    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }

    public void sofrerDano(int dano) {
        this.blindagem = blindagem - dano;
        if (blindagem <= 0) {
            this.destruido = true;
            this.blindagem = 0;
            this.ligado = false;
        }
    }

    public void info() {
        System.out.println("---------------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Ligado: %s\n", this.ligado ? "Sim" : "Não");
        System.out.printf("Destruido: %s\n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem: %d\n", this.blindagem);
        System.out.printf("Armamento: %s\n", this.armamento ? "Sim" : "Não");
    }
}
