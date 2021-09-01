import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Flow007 {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int a = Integer.parseInt(br.readLine());
            if(a%10==0){
                while(a%10==0){
                    a = a/10;
                }
            }
            String s = Integer.toString(a);
            sb.append(s);
            System.out.println(sb.reverse());
            sb.delete(0,s.length()+1);
            t--;
        }
    }
}
