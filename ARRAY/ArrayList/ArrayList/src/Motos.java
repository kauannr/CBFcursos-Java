public class Motos {
private String nome;
private double cilindrada;
private double quilometragem;

    public Motos(String nome,double cilindrada, double quilometragem ){
        this.nome = nome;
        this.cilindrada = cilindrada;
        this.quilometragem = quilometragem;
    }
    public String getNome(){
        return nome;
    }

    public String toString(){
        return 
                "Nome: " + this.nome +
                " Cilindrada: " + this.cilindrada +
                " Quilometragem: " + this.quilometragem ;
                
    }

    


    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the cilindrada
     */
    public double getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return double return the quilometragem
     */
    public double getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

}
