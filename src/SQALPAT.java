import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SQALPAT {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sumi = 0; int sumj=10;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=sumi+1;j<=sumi+5;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
                sumi = sumi+10;
            }else{
                for(int j= sumj;j>=sumj-4;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
                sumj = sumj+10;
            }
        }
    }
}
