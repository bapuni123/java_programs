import java.util.Scanner;

public class TWTCLOSE {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=0;
        while(k-- > 0){
            String s=sc.next();

            if(s.equals("CLICK") )
            {
                int t=sc.nextInt();
                if(a[t-1]==0)
                    a[t-1]=1;
                else
                    a[t-1]=0;
            }
            if(s.equals("CLOSEALL")){
                for(int i=0;i<n;i++)
                    a[i]=0;
            }

            int count=0;
            for(int i=0;i<n;i++){
                if(a[i]==1)
                    count++; }
            System.out.println(count);
        }
    }
}
