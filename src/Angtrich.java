import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Angtrich {
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

         if(a!=0 && b!=0 &&c!=0 && a+b+c == 180){
             System.out.print("YES");
         }else{
             System.out.print("NO");
        }
    }



}
