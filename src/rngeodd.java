import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rngeodd {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input;
        int l;
        int r;
        input= br.readLine().split(" ");

        l = Integer.parseInt(input[0]);
        r= Integer.parseInt(input[1]);
        for (int i= l; i<=r; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

    }
}
