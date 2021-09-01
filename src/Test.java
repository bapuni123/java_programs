
import java.util.Scanner;

public class Test {

    public static void main(String[] args)throws java.lang.Exception{

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            if(n==42)
                break;
            else
                System.out.println(n);
        }
    }
}
