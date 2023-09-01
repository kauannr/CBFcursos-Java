public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste array");

        int tam_questoes = 5;
        char[] gabarito = {'a','a','d','b','b'};
        char[] respostas = new char[tam_questoes];
        int nota = 0;

        respostas[0] ='a';
        respostas[1] ='b'; 
        respostas[2] ='c';
        respostas[3] ='b';
        respostas[4] ='c'; 
        for(int j=0; j<=tam_questoes; j++){
            if(respostas[j] == gabarito[j]){
            nota++;
            }
        } 
        System.out.printf("Nota final: %d", nota);

    }
}
