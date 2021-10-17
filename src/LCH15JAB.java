import java.util.Scanner;

public class LCH15JAB {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int[] fre = new int[26];
            for( int i=0;i<n;i++){
                int index = s.charAt(i)-'a';
                fre[index]++;
            }
            boolean ans = false;
            for(int i=0;i<26;i++){
                if (fre[i] == n - fre[i]) {
                    ans = true;
                    break;
                }
            }
            if(ans){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
