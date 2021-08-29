import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sumevod {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       long n = Long.parseLong(br.readLine());
        long count = 0;
        long count1 =0;
        for(long i=1;i<=n*2;i++){
            if(i%2==0){
                count = count+i;
            }else{
                count1 = count1+i;
            }
        }

        System.out.print(count1+" "+count);

    }
}
