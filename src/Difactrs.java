import java.lang.*;
import java.io.*;
public class Difactrs {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i =1;i<=n;i++){
            if (n%i == 0 )
            count = count+1;
        }
        System.out.println(count);
        for(int j = 1;j<=n;j++){
            if(n%j == 0){
                System.out.print(j+" ");
            }
        }

    }
}
