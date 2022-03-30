import java.util.Scanner;

public class RCBPLAY {

    public static void main(String[ ] rgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z= sc.nextInt();
            if((z*2)+x>=y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
