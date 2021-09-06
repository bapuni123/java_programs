import java.util.Scanner;

public class FLOW004 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int sum ;
        while(t>0){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            sum = Integer.parseInt(String.valueOf(s.charAt(0)))+Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
            System.out.println(sum);
            sum=0;
            t--;
        }
    }
}
