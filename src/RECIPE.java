import java.util.Scanner;

public class RECIPE {
    static int gcd(int a , int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
   static int findgcd(int[] arr)
   {
     int result = 0;
     for(int element: arr)
     {
         result = gcd(result,element);
     }
     return result;
   }
    static void solve()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = findgcd(arr);
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]/x+" ");

        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            solve();
        }
    }
}
