import java.util.*;
public class MULTHREE {

    public static void main(String[] args)throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long size = sc.nextLong();
            long d0 = sc.nextLong();
            long d1 = sc.nextLong();

            long num = d0;
            num = num*10+d1;
            long sum = d0+d1;

            if(sum%5==0)
                System.out.println("NO");

            else{
                sum += sum%10;
                for(long i=((size-3)%4);i>0;i--)
                    sum += sum%10;

                sum += ((size-3)/4)*20;

                if(sum%3 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
