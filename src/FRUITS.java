import java.util.Scanner;

public class FRUITS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if(n>m){
                int diff = n-m;
                m+=Math.min(diff,k);
                System.out.println(n-m);
            }else if(n==m){
                System.out.println(0);
            }else{
                int diff=m-n;
                n+=Math.min(diff,k);
                System.out.println(m-n);
            }
        }
    }
}
