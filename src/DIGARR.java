import java.util.Scanner;

public class DIGARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0)
        {
            int d = sc.nextInt();
            String str = sc.next();
            int count=0;
            for(int i=0;i<d;i++)
            {
                if(str.charAt(i)=='0' || str.charAt(i)=='5')
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }

            t--;
        }
    }
}
