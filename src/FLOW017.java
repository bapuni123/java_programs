import java.util.Scanner;

public class FLOW017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if( (a > b && b > c) || (c > b && b > a) ) {
                System.out.println(b);
            }
            else if( (a > c && c > b) || (b > c && c > a) ) {
                System.out.println(c);
            }
            else {
                System.out.println(a);
            }
        }
        sc.close();
    }
}
