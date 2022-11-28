// Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.

public class App {
    public static void main(String[] args) throws Exception {
        somaImposto(5, 400);
    }

    public static void somaImposto(double taxaImposto, double custo) {
        System.out.println(custo+((taxaImposto/100)*custo));
    }
}
