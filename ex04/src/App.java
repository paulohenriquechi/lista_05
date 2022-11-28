// Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.

public class App {
    public static void main(String[] args) throws Exception {
        valorNumero(0);
    }
    public static void valorNumero(int n){
        if(n>0){
            System.out.println("P");
        }else{
            System.out.println("N");
        }
    }
}
