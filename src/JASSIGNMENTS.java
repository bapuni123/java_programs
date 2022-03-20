import java.util.Scanner;

public class JASSIGNMENTS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(10-x>=3){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
