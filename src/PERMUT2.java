import java.util.Scanner;

public class PERMUT2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int count =0;
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            int [] arr = new int[n];
            int [] newarr = new int[n+1];
            int [] inv = new int[n+1];
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }
            if (newarr.length - 1 >= 0) System.arraycopy(arr, 0, newarr, 1, newarr.length - 1);
            newarr[0] = 0;
          for(int j=0;j<newarr.length;j++)
            {
                inv[newarr[j]] = j ;
            }
          for(int l=0;l<newarr.length;l++)
          {
              if(newarr[l] == inv[l])
              {
                  count =count+1;
              }
          }
          if(count==newarr.length)
          {
              System.out.println("ambiguous");
          }else
          {
              System.out.println("not ambiguous");
          }
        }
    }
}
