import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZCO14003 {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long[] arr = new long[(int) n];
        long count = Long.MIN_VALUE;
        long temp = n;
        for(long i=0;i<n;i++){
            long a = Long.parseLong(br.readLine());
            arr[(int)i] = a;
        }
        Arrays.sort(arr);
        for(long j=0;j<n;j++){
            long res = arr[(int)j]*temp;
            if(res>=count){
                count = res;
            }
            temp--;
        }

        System.out.print(count);
    }
}
