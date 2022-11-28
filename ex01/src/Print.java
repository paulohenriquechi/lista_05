public class Print {
    public static void impressao(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i||j>i){
                    System.out.println(i);
                }else{
                    System.out.print(i);
                }
            }
        }
    }
}
