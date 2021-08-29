
import java.util.Scanner;

public class Addnatrl {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count =0;
        for(long i=1;i<=n;i++){
           count = count+i;
        }

        System.out.print(count);
    }
}
