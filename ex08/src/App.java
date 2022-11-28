public class App {
    public static void main(String[] args) throws Exception {
        digitos(0);
    }

    public static void digitos(int n) {
        String s = Integer.toString(n);
        System.out.println(s.length());
    }
}
