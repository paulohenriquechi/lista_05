import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        jogar();
    }

    public static void jogar() {
        Random random = new Random();
        int numero = random.nextInt(2, 13);
        System.out.println("Seu número: "+numero);
        switch (numero) {
            case 7:
            case 11:
                System.out.println("Ganhou!");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("Perdeu!");
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println("Ponto!");
                jogar();
                break;
            default:
                break;
        }
    }
}
