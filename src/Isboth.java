import java.lang.*;
import java.io.*;
import java.util.*;

public class Isboth {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] input = new String[1];
       input = br.readLine().split(" ") ;

        int n = Integer.parseInt(input[0]);

        if (n%5 == 0 && n%11 == 0){
            System.out.print("BOTH");
        }else if(n%5 == 0 || n%11 == 0){
            System.out.print("BOTH");
        }else{
            System.out.print("NONE");
        }
    }
}
