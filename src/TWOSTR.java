import java.util.Scanner;

public class TWOSTR {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2=  sc.next();
            StringBuilder s3 = new StringBuilder();
            StringBuilder s4= new StringBuilder();

            for(int i=0;i<s1.length();i++){
               if(s1.charAt(i) == s2.charAt(i)){
                   s3.append(s1.charAt(i));
                   s4.append(s2.charAt(i));
               }else if(s1.charAt(i)=='?'){
                   s3.append(s2.charAt(i));
                   s4.append(s2.charAt(i));
               }else if(s2.charAt(i)=='?'){
                   s3.append(s1.charAt(i));
                   s4.append(s1.charAt(i));
               }else{
                   s3.append(s1.charAt(i));
                   s4.append(s2.charAt(i));
               }
            }
            if(s3.toString().equals(s4.toString())){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
