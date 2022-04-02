import java.util.Scanner;

public class IMDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int min = Integer.MIN_VALUE;
            int n = sc.nextInt();
            int x = sc.nextInt();
            for(int i=0;i<n;i++){
                int si = sc.nextInt();
                int ri = sc.nextInt();
                if(si<x){
                    if(ri>min){
                        min =ri;
                    }
                }else if(si==x){
                    if(ri>min){
                        min = ri;
                    }
                }
            }

            System.out.println(min);

        }
    }
}
