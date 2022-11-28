public class App {
    public static void main(String[] args) throws Exception {
        desenhar(5, 5);
    }

    public static void desenhar(int l, int c) {
        for (int i = 0; i < c; i++) {
            if (i==0||i==(c-1)) {
                for (int j = 0; j < l-1; j++) {
                    if(j==0){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }
                System.out.println("+");
            } else {
                for (int j = 0; j < l-1; j++) {
                    if(j==0){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
        }
    }
}
