import java.util.Scanner;

public class FLOW010 {

    public static void main(String[] rgs)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String c = sc.next();
            String s= c.toLowerCase();
            if(s.equals("b"))
            {
                System.out.println("BattleShip");
            }else if(s.equals("c"))
            {
                System.out.println("Cruiser");
            }else if(s.equals("d"))
            {
                System.out.println("Destroyer");
            }else if(s.equals("f"))
            {
                System.out.println("Frigate");
            }
        }
    }
}
