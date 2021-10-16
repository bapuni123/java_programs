import java.util.*;
class MISSP
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            int dolls=sc.nextInt();
            int[] pair =new int[dolls];
            for(int i=0;i<pair.length;i++){
                pair[i]=sc.nextInt();
            }
            for (int k : pair) {
                int c = 0;
                for (int i : pair) {
                    if (k == i) {
                        c++;
                    }

                }
                if (c % 2 != 0) {
                    System.out.println(k);
                    break;

                }
            }
        }
    }
}
