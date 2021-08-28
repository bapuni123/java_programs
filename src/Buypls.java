import java.lang.*;
import java.io.*;
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Buypls
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[4];

        int a ;
        int b;
        int c;
        int d;
        input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b= Integer.parseInt(input[1]);
        c=Integer.parseInt(input[2]);
        d=Integer.parseInt(input[3]);

        int sum = (a*c) + (b*d);

        System.out.println(sum);
    }
}
