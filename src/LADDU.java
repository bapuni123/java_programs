import java.lang.*;
import java.io.*;
class LADDU
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0) {
            String [] input;
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            String s = input[1];
            int sum = 0;
            while (a > 0) {
                String [] input1;
                input1 = br.readLine().split(" ");
                String s1 = input1[0];

                if (s1.equals("CONTEST_WON" )){
                    int rank = Integer.parseInt(input1[1]);
                    sum = sum + 300;
                    if (rank < 20) {
                        sum = sum + (20 - rank);
                    }
                }else if(s1.equals("TOP_CONTRIBUTOR")){
                    sum = sum + 300;
                }else if(s1.equals("BUF_FOUND")){
                    int sev = Integer.parseInt(input1[1]);
                    sum = sum + sev;
                }else{
                    sum = sum + 50;

                }
                a--;
            }
            int ans = 0;
            int redeem = s.equals("INDIAN") ? 200:400;
            while(sum>redeem){
                sum= sum-redeem;
                ans++;
            }
            System.out.println(ans);
            t--;
        }
    }
}
/*
import java.util.*;

class codechef {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		while (t --> 0) {

			int q = scan.nextInt();
			String origin = scan.next();
			int laddo = 0;

			for (int i = 0; i < q; i++) {

				String s = scan.next();

				if (s.equals("TOP_CONTRIBUTOR")) laddo += 300;
				else if (s.equals("CONTEST_HOSTED")) laddo += 50;
				else if (s.equals("CONTEST_WON")) {

					int rank = scan.nextInt();

					if (rank <= 20) laddo += 300 + (20 - rank);
					else laddo += 300;

				} else if (s.equals("BUG_FOUND")) {

					int severity = scan.nextInt();
					laddo += severity;
				}
			}

			System.out.println(origin.equals("INDIAN") ? laddo / 200 : laddo / 400);
		}

        scan.close();
    }
}*/