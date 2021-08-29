import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Revmee {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input ;
        input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          int a = Integer.parseInt(input[i]);
          arr[i] =a;
        }

        for(int k=n-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }
    }
}
