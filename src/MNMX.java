import java.util.Arrays;
import java.util.Scanner;

public class MNMX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            for(long i=0;i<n;i++){
                arr[(int) i] = sc.nextLong();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]*(n-1));
        }
    }
}
