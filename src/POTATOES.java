import java.util.Scanner;

public class POTATOES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count =1;
            int sum = x+y+1;
            for(int i=2;i<=sum/2;i++){
                if(sum%i==0) {
                    sum = sum + 1;
                    count++;
                    i=1;
                }
            }
            System.out.println(count);
        }
    }
}
