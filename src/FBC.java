import java.util.Scanner;

public class FBC {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(k-x);
        }

    }
}
