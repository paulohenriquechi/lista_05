import java.util.Scanner;

// Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Digite as horas: ");
            int horas = input.nextInt();
            System.out.println("Digite os minutos: ");
            int mins = input.nextInt();
            conversor(horas, mins);
            System.out.println("Deseja continuar?\n1 - Sim\n2 - Não");
            option = input.nextInt();
        } while (option!=2);
        input.close();
    }

    public static void conversor(int horas, int mins) {
        if(horas>12){
            horas -= 12;
            imprimir(horas, mins, "P.M");
        }else{
            imprimir(horas, mins, "A.M");
        }
    }
    public static void imprimir(int horas, int mins, String fuso) {
        System.out.println(horas+":"+mins+" "+fuso);
    }
}
