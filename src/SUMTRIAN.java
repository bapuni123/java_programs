import java.util.Scanner;

public class SUMTRIAN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n+1][n+1];
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            int [][] dp = new int[n+1][n+1];
            for(int j=1;j<=n;j++)
            {
                dp[n][j] = arr[n][j];
            }
            //if (n >= 0) System.arraycopy(arr[n], 1, dp[n], 1, n);
            for(int i=n-1;i>=0;i--) {
                for (int j = 1; j <= i; j++) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i+1][j],dp[i+1][j+1]);
                }
            }
            System.out.println(dp[1][1]);
        }
    }
}
