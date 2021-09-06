import java.util.Scanner;

public class LUCKFOUR {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count =0;
        while(t-->0){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='4'){
                    count++;
                }
            }
            System.out.println(count);
            count =0;
        }
        sc.close();
    }
}
