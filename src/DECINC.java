import java.util.Scanner;

public class DECINC {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 == 0){
            n = n+1;
        }else{
            n--;
        }
        System.out.println(n);
        sc.close();
    }
}
