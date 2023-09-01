public class registro {
    private String nome;
    private String nome_da_mae;
    private int idade = 0;
    private int cpf = 0;
    
    public registro(String nome, String nome_da_mae,int idade,int cpf){
    this.nome = nome;
    this.nome_da_mae = nome_da_mae;
    this.idade = idade;
    this.cpf = cpf;
    }
    public void info(){
        System.out.println("------------");
        System.out.printf("Nome: %s\n",nome);
        System.out.printf("Nome da mãe: %s\n",nome_da_mae);
        System.out.printf("Idade: %d\n",idade);
        System.out.printf("Cpf: %d\n",cpf);
    }
}
