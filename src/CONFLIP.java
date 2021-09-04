import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CONFLIP {
    public  static void main(String[] args)throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int g = Integer.parseInt(br.readLine());
            while(g>0){
                String [] input;
                input = br.readLine().split(" ");
                int I,N,Q;
                I = Integer.parseInt(input[0]);
                N = Integer.parseInt(input[1]);
                Q = Integer.parseInt(input[2]);
                if(I==Q){
                    System.out.println(N/2);
                }else{
                    System.out.println(N-N/2);
                }
                g--;
            }
            t--;
        }
    }
}
