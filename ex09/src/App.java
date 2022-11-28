// Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721.

public class App {
    public static void main(String[] args) throws Exception {
        numeroInverso(1234);
    }

    public static void numeroInverso(int n) {
        String numeroInverso = Integer.toString(n);
        for (int i = numeroInverso.length(); i > 0; i--) {
            System.out.print(numeroInverso.charAt(i-1));
        }
        System.out.println("");
    }

}
