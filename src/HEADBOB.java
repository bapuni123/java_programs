import java.util.*;
class HEADBOB {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int non =0;
            int noy = 0;
            int noi = 0;
            int N = sc.nextInt();
            String S = sc.next();
            for(int i=0; i<N; i++){
                if(S.charAt(i)=='I'){
                    noi++;
                }
                else if(S.charAt(i)=='Y'){
                    noy++;
                }
                else{
                    non++;
                }
            }
            if(noi>0){
                System.out.println("INDIAN");
            }
            else if(noi==0 && noy>0){
                System.out.println("NOT INDIAN");
            }
            else{
                System.out.println("NOT SURE");
            }

        }
    }
}

