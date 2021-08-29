import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EXTRICHK {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        int a;
        int b;
        int c;
        input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c= Integer.parseInt(input[2]);

        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c){
                System.out.print(1);
            }else if(a==b || b==c || c==a){
                System.out.print(2);
            }else{
                System.out.print(3);
            }
        }else{
            System.out.print(-1);
        }
    }
}
