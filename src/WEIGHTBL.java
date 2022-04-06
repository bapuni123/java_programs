import java.util.Scanner;

public class WEIGHTBL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w1= sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int m = sc.nextInt();
            int minposs = x1*m;
            int maxposs = x2*m;
            int w = w2-w1;
            if(w>=minposs && w<=maxposs){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
