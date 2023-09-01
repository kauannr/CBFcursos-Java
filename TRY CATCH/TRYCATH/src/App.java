
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Execeções personalizadas");
        //Primeiro sem a java.lang.ArithmeticException. Testando só o erro do array.

        int [] numerador = {4,8,8,10};
        int [] denominador = {2,4,2,2,8};
        int [] result = new int[denominador.length];

        try{
            for(int i=0; i<denominador.length; i++){
                result[i] = numerador[i] / denominador[i];
            } System.out.println(result);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getLocalizedMessage() + " Verifique o tamanho do array");
        }
        catch(Exception e){
            System.out.println("Erro genérico. Verifique o código");
        }

        
        
    }
}
