import java.util.Scanner;
import javax.swing.text.NumberFormatter;


public class Pseudocodel
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the amount due in pennies? ");
        int due = s.nextInt();
        System.out.println("What is the amount received in pennies? ");
        int received = s.nextInt();
        
        int change = received - due;
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        
        dollars = change/100;
        change = change - dollars*100;
        quarters = change/25;
        change = change - quarters*25;
        dimes = change/10;
        change = change - dimes*10;
        nickels = change/5;
        change = change - nickels*5;
        pennies = change;
        
        System.out.println("Dollars: ");
        System.out.println(dollars);
        System.out.println("Quarters: ");
        System.out.println(quarters);
        System.out.println("dimes: ");
        System.out.println(dimes);
        System.out.println("nickels: ");
        System.out.println(nickels);
        System.out.println("pennies: ");
        System.out.println(pennies);        
    }
}
