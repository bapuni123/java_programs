import java.util.Scanner;

public class CARRYGOLD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((n+1)*y>=x){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
