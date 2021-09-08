import java.util.Scanner;

public class AMR15A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        while(n-->0){
            int w = sc.nextInt();
            if(w%2==0){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1>count2){
            System.out.println("READY FOR BATTLE");
        }else{
            System.out.println("NOT READY");
        }
    }
}
