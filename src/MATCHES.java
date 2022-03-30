import java.util.Scanner;

public class MATCHES {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[10];
            int ans = 0;
            arr[0] = 6;
            arr[1] = 2;
            arr[2] = 5;
            arr[3] = 5;
            arr[4] = 4;
            arr[5] = 5;
            arr[6] = 6;
            arr[7] = 3;
            arr[8] = 7;
            arr[9] = 6;
            int res = a+b;
            while(res>0){
                int r = res%10;
                for(int i=0;i<=9;i++){
                    if(i==r){
                       ans = ans+arr[i];
                       break;
                    }
                }
                res = res/10;
            }

            System.out.println(ans);

        }
    }
}
