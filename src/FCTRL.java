import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FCTRL {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        long count = 0;
        while (t>0){
            long n = Long.parseLong(br.readLine());
            while(n>=5){
                count = count+(n/5);
                n =n/5;
            }
            System.out.println(count);
            count = 0;
            t--;
        }

    }
}
