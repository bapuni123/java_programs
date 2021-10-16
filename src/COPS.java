import java.util.Scanner;

public class COPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int x= sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[101];
            for(int i=0;i<m;i++){
                arr[i] = sc.nextInt();
            }
            int count =0;
            int dis = x*y;
            for(int i=1;i<=100;i++){
                boolean safe = true;
                for(int j=0;j<m;j++){
                    int leftrange = Math.max(arr[j]-dis,1);
                    int rightrange = Math.min(arr[j]+dis,100);
                    if (i >= leftrange && i <= rightrange) {
                        safe = false;
                    }
                }
                if(safe){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
