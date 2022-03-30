import java.util.Scanner;

public class SALE2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int q = n/3;
            int r = n%3;
            int ans = (2*q+r)*x;
            System.out.println(ans);
        }
    }
}
