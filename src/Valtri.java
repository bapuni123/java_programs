
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Valtri {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n%5==0 || n%6==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
