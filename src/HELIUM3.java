import java.util.Scanner;

public class HELIUM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x*y>=a*b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
