import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MULTHREE {

    public static void main(String[] args)throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());
        while(t>0){
            String[] input;
            long k;
            long d1;
            long d2;
            input = br.readLine().split(" ");
            k = Long.parseLong(input[0]);
            d1= Long.parseLong(input[1]);
            d2= Long.parseLong(input[2]);
            //String s1 = Long.toString(d1) + Long.toString(d2);
            long sum =0;
            long count = d1+d2;
            for(long i=2;i<k;i++){
                sum = (sum+d1+d2)%10;
                count = count+sum;
            }
            if(count%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
