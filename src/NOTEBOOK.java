import java.util.Scanner;

public class NOTEBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int p = n*1000;
            System.out.println(p/100);
        }
    }
}
