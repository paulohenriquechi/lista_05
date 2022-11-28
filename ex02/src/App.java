import java.util.Scanner;

// Faça um programa para imprimir:
//     1
//     1   2
//     1   2   3
//     .....
//     1   2   3   ...  n
// para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 9");
        int numero = input.nextInt();
        if (numero<=0||numero>10) {
            System.out.println("Número inválido, tente novamente");
        }else{
            imprimir(numero);
        }
        input.close();
    }

    public static void imprimir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i||j>i){
                    System.out.println(j);
                }else{
                    System.out.print(j);
                }
            }
        }
    }
}
