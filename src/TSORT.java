import java.util.Arrays;
import java.util.Scanner;

public class TSORT {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int i =0;
        while(t-->0){
            int n = sc.nextInt();
            arr[i] = n;
            i++;
        }
        Arrays.sort(arr);
        for (int k : arr) {
            System.out.println(k);
        }
        sc.close();
    }
}
