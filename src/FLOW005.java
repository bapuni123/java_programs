import java.util.Scanner;

public class FLOW005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {100,50,10,5,2,1};
        while(t-->0)
        {
            int n = sc.nextInt();
            int ans =0;
           for( int i=0;i<6;i++)
           {
            ans =ans+(n/arr[i]);
            n = n-(arr[i]*(n/arr[i]));
           }
           System.out.println(ans);
        }
    }
}
