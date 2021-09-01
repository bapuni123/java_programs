import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lapin {
    public static void main(String[] args) throws java.lang.Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            String s = br.readLine();
            int n = s.length();
            if(n%2==0) {

                int a = n / 2;
                char[] ch1 = new char[a];
                char[] ch2 = new char[a];
                int count = 0;
                for (int i = 0; i <= a - 1; i++) {
                    ch1[i] = s.charAt(i);
                }
                Arrays.sort(ch1);
                String s1 = new String(ch1);
                for (int j = a; j < s.length(); j++) {
                    ch2[count] = s.charAt(j);
                    count++;
                }
                Arrays.sort(ch2);
                String s2 = new String(ch2);
                if (s1.equals(s2)) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                int b = n/2;
                char[] ch3 = new char[b];
                char[] ch4 = new char[b];
                int count1 =0;
                for(int k=0;k<=b-1;k++){
                    ch3[k] = s.charAt(k);
                }
                Arrays.sort(ch3);
                String s3= new String(ch3);

                for(int l=b+1;l<s.length();l++){
                    ch4[count1] = s.charAt(l);
                    count1++;
                }
                Arrays.sort(ch4);
                String s4 = new String(ch4);
                if(s3.equals(s4)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            t--;
        }
    }
}
