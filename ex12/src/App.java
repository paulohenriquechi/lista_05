import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Embaralha palavra. Construa uma função que receba uma string como parâmetro e devolva outra string com os carateres embaralhados. Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra combinação possível, de forma aleatória. Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja embaralhar: ");
        String palavra = input.nextLine();
        embaralharPalavra(palavra.toLowerCase());
    }

    public static void embaralharPalavra(String palavra) {
       List<Character> palavraNova = new ArrayList<Character>(); 
       for (int i = 0; i < palavra.length(); i++) {
        palavraNova.add(palavra.charAt(i));
       }
       Collections.shuffle(palavraNova);
       System.out.println("Palavra Embaralhada: ");
       for (Character character : palavraNova) {
        System.out.print(character);
       }
       System.out.println("");
    }
}

    // char[] p = new char[palavra.length()];
    // for (int i = 0; i < palavra.length(); i++) {
    //     p[i] = palavra.charAt(i);
    // }