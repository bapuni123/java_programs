import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CARVAN {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int n = Integer.parseInt(br.readLine());
            String[] input;
            int[] arr = new int[n];
            input = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                int a = Integer.parseInt(input[i]);
                arr[i] = a;
            }
            int min = arr[0];
            int res = 0;
            for(int i=0;i<n;i++ ){
                if(arr[i]<=min){
                    min =arr[i];
                    res++;
                }
            }
            System.out.println(res);
            t--;

        }

    }
}
