import java.util.Scanner;

// Faça um programa para imprimir:
//     1
//     2   2
//     3   3   3
//     .....
//     n   n   n   n   n   n  ... n
// para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 9: ");
        int numero = input.nextInt();
        if (numero<=0||numero>10) {
            System.out.println("Número inválido, tente novamente");
        }else{
            Print.impressao(numero);
        }
        input.close();
    }
}
