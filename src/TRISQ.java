import java.util.Scanner;

public class TRISQ {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int b = sc.nextInt();
            b = b-2;
            b = b/2;
            int ans = b*(b+1)/2;
            System.out.println(ans);
        }

        sc.close();
    }
}
