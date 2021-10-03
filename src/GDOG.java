import java.util.Scanner;

public class GDOG {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            int res = 0;
            for(int j=1;j<=k;j++)
            {
                if(res<(n%j))
                    res = (n%j);
            }
            System.out.println(res);
        }
    }
}
