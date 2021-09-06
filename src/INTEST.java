import java.io.BufferedReader;
import java.io.InputStreamReader;

public class INTEST {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int count = 0;
        while(n-->0){
            int a = Integer.parseInt(br.readLine());
            if(a%k ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
