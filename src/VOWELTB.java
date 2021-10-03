import java.util.Scanner;

public class VOWELTB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char c1 = Character.toUpperCase(c);
        if(c1=='A' || c1=='E'||c1=='I'||c1=='O'||c1=='U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
