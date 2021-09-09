import java.util.Scanner;

public class PALL01 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while (t-->0)
        {

            int n =sc.nextInt();
            String s = Integer.toString(n);
            String s1 = "";
            for(int i=s.length()-1;i>=0;i--)
            {
                s1+=s.charAt(i);
            }
            if(s.equals(s1))
            {
                System.out.println("wins");
            }else
            {
                System.out.println("loses");
            }
        }
        sc.close();
    }
}
