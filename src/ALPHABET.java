import java.util.Scanner;

public class ALPHABET {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        while(n-->0){
            String w = sc.next();
            int flag =1;
            for( int i=0;i<w.length();i++){
                char c = w.charAt(i);
                if(s.indexOf(c)==-1){
                    flag =0;
                    break;
                }
            }
            if(flag==0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
