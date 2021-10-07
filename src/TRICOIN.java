import java.util.Scanner;

public class TRICOIN {
   static boolean check(long mid,long n){
        return ((mid*(mid+1))/2 <=n);
    }
    static void solve(long n){
        long ans = -1;
        long l = 1;
        long r = (long) 1e5;
        while (l<=r) {
            long mid = l + (r - l) / 2;
            if (check(mid,n)){
                ans =Math.max(ans,mid);
                l= mid+1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong();
            solve(n);
        }
    }
}