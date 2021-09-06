import java.util.Scanner;

public class FLOW002 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1%n2);
            t--;
        }
        sc.close();
    }
}
