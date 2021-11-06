import java.util.Scanner;

public class TWONMS {

    static int div(int a, int b, int n){
        if (n % 2 == 0) {
            return Math.max(a,b)/Math.min(a,b);
        }

        return Math.max(2*a,b)/Math.min(2*a,b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(div(a,b,n));
        }
    }
}
