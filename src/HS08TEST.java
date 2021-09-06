import java.util.Scanner;

public class HS08TEST {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int b=scan.nextInt();
        double c=scan.nextDouble();
        if(b%5==0 && (c>=(b+0.5))){
            System.out.printf("%.2f%n",(c-b-0.5));
        }
        else{
            System.out.printf("%.2f%n",c);
        }



    }
}
