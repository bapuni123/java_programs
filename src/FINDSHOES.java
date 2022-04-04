import java.util.Scanner;

public class FINDSHOES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n<m){
                System.out.println(n);
            }else{
                int left = n-m;
                System.out.println(n+left);
            }
        }
    }
}
