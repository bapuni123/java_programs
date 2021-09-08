import java.util.Scanner;

public class CIELRCPT {

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int count = 0;
            for (int i = 11; i >= 0; i--) {
                int curpow = (int) Math.pow(2,i);
                while (p >= curpow) {
                    p = p - curpow;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
