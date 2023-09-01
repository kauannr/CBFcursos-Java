abstract class Animal implements SerVivo {

private int massa;
private int forca;
private boolean esta_vivo;


    public Animal(int massa,int forca){ //Construtor
        this.massa = massa;
        this.forca = forca;
    }
        //SET e GET Vivo
        public void setVivo(boolean esta_vivo){
        this.esta_vivo = esta_vivo;
        }
        public boolean getVivo(){
            return this.esta_vivo;
        } 
        //SET e GET Força
        public void setForca(int forca){
            this.forca = forca;
        }
        public int getForca(){
            return forca;
        }
        //SET e GET Massa
        public void setMassa(int massa){
            this.massa = massa;
        }
        public int getMassa(){
            return massa;
        }

    public void atacar(Animal outro) { //Atacando o animal
        if(this.esta_vivo==true){
            if(this.forca >= outro.forca){
                System.out.println("Animal atacado");
                outro.massa -= 2;
            } else{
                System.out.println(outro.getClass() + " é mais forte!");
            }
        }else{
            System.out.println(this.getClass() + " está morto, não pode atacar");
        }
    }

    public void comer(int quantidade) {
        if(this.esta_vivo==true){
            this.forca = forca + quantidade;
        }
        else{
            System.out.println(this.getClass() + " não pode comer porque está morto");
        }
    }

    public void info(){
        System.out.printf("Tipo: %s\n" , this.getClass());
        if(this.esta_vivo == true){
            System.out.println("Status: vivo");
        }
        else{
            System.out.println("Status: morto");
        }
        System.out.printf("Massa: %d\n", this.massa);
        System.out.printf("Forca: %d\n", this.forca);
        System.out.println("------------------");

    }
}
