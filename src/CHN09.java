import java.util.Scanner;

public class CHN09 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next().toLowerCase();
            int count1 =0;
            int count2 =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'){
                    count1++;
                }else{
                    count2++;
                }
            }
            if(count1==0 || count2==0){
                System.out.println(0);
            }else if(count1==count2){
                System.out.println(count1);
            }else System.out.println(Math.min(count1, count2));
        }
    }
}
