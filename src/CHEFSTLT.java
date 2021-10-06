import java.util.Locale;
import java.util.Scanner;

public class CHEFSTLT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 =sc.next().toLowerCase();
            String s2 = sc.next().toLowerCase();
            int n = s1.length();
            int min =0;
            int max=0;
            for(int i=0;i<n;i++){
                if(s1.charAt(i)=='?' || s2.charAt(i)== '?' ){
                    min =min+0;
                    max = max+1;
                }else if((s1.charAt(i)!='?' || s2.charAt(i)!='?')
                        &&(s1.charAt(i)!=s2.charAt(i))){
                    min = min+1;
                    max = max+1;
                }else{
                    min =min+0;
                    max =max+0;
                }
            }

            System.out.println(min+" "+max);
        }
    }
}
