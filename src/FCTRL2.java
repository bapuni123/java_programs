/*import java.util.Scanner;

public class FCTRL2 {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int fact ;
            fact = factorial(n);
            System.out.println(fact);
        }
    }
}
*/
//CALCULATING FACTORIAL FOR BIG INTEGER
import java.math.BigInteger;
import java.util.Scanner;

public class FCTRL2 {


    static BigInteger factorial(int N)
    {

        BigInteger f = new BigInteger("1");
        if(N==0 || N==1){
            return f;
        }


        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    // Driver method
    public static void main(String[] args) throws Exception
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int N = sc.nextInt();
            System.out.println(factorial(N));
        }
    }
}