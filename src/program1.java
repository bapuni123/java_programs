import java.io.BufferedReader;
import java.io.InputStreamReader;

class program1 {

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int n = (L-R)+1;

        if (n%2==0) {
            System.out.println(n/2);
        }else {
            if(R%2!=0 || L%2!=0) {
                System.out.println(n/2+1);
            }else {
                System.out.println(n/2);
            }
        }
    }

}
