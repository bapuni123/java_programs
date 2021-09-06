import java.util.Scanner;

public class TLG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long flag = 0, lead = 0;
        long t1 = 0, t2 = 0, s1, s2;
        for (int i = 0; i < N; i++) {
            s1 = sc.nextLong();
            s2 = sc.nextLong();
            t1 = t1 + s1;
            t2 = t2 + s2;
            if (t1 > t2 && (t1 - t2) > lead) {
                flag = 1;
                lead = t1 - t2;
            } else if (t2 > t1 && (t2 - t1) > lead) {
                flag = 2;
                lead = t2 - t1;
            }
        }
        System.out.println(flag + " " + lead);
        sc.close();
    }
}
