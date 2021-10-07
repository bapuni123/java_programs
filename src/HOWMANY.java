import java.util.Scanner;

public class HOWMANY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int len = s.length();
        if(len==1){
            System.out.println(1);
        }else if(len==2){
            System.out.println(2);
        }else if(len==3){
            System.out.println(3);
        }else{
            System.out.println("More than 3 digits");
        }
    }
}
