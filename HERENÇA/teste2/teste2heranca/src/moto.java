public class moto {
 private String nome;
 private int vel_maxima;
 private int marchas;

    public moto(String nome){ //Construtor
        this.nome = nome;
        this.vel_maxima = 0;
        this.marchas = 0;
    }
    
    public void setVel_maxima(int vel_maxima){ //Metodo da velocidade
        this.vel_maxima = vel_maxima;
    }

    public void setMarchas(int marchas){ //Metodo das marchas
        this.marchas = marchas;
    }

    public void info(){ //Imprimir informações.
        System.out.println("----------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Velocidade maxima: %dkm/h\n", vel_maxima);
        System.out.printf("Numero de marchas: %d\n", marchas); 
    }

}
