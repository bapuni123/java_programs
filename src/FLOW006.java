import java.util.Scanner;

public class FLOW006 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int res;
        while(t>0) {
            int n = sc.nextInt();
            while (n > 0) {
                res = n % 10;
                sum = sum + res;
                n = n / 10;
            }
            System.out.println(sum);
            sum =0;
            t--;
        }
        sc.close();
    }
}
