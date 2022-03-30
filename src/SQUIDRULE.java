import java.util.Scanner;

public class SQUIDRULE {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ans =0;
            int max= Integer.MAX_VALUE;
            int arr [] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=max){
                    max = arr[j];
                }
                ans = ans+arr[j];
            }
            System.out.println(ans-max);
        }
    }
}
