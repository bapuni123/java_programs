import java.util.Scanner;

public class COMM3 {
    static int solve(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int count = 0;
            if (solve(x1, y1, x2, y2) <= r * r)
                count++;
            if (solve(x2, y2, x3, y3) <= r * r)
                count++;
            if (solve(x1, y1, x3, y3) <= r * r)
                count++;
            if (count >= 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}
