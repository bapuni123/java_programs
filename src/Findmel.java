
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Findmel {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstnums ;
        int n;
        int k;
        firstnums = br.readLine().split(" ");
         n = Integer.parseInt(firstnums[0]);
         k = Integer.parseInt(firstnums[1]);
        String[] input ;
        input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(input[i]);
            arr[i] =a;
        }
        int count = 0;
        for (int i : arr) {
            if (i == k) {
                count = count+1;
            }
        }

        if (count >=1){
            System.out.print(1);
        }else{
            System.out.print(-1);
        }
    }
}