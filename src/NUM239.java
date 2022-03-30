import java.util.Scanner;

public class NUM239 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int i=l;i<=r;i++){
                int ans = i%10;
                if(ans==3 || ans==2 || ans==9){
                    count = count+1;
                }
            }
            System.out.println(count);
        }
    }
}
