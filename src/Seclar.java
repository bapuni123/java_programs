import java.lang.*;
import java.io.*;
import java.util.*;

public class Seclar {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a>b && b>c || c>b && b>a)
            System.out.println(b);
        else if(b>a && a>c || c>a && a>b)
            System.out.println(a);
        else if(b>c && c>a || a>c && c>b)
            System.out.println(c);

    }
}
