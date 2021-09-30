import java.util.Scanner;

public class FLOW011 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int bs = sc.nextInt();
             double gs;
            if(bs<1500)
            {
                gs = bs+(0.1*bs)+(0.9*bs);
            }else
            {
                gs = bs+500+(0.98*bs);
            }
            System.out.printf("%.6f",gs);
            System.out.println();
        }
    }
}
