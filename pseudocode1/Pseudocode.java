import java.util.Scanner;

public class Pseudocode
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 10 digit number: ");
        String num = s.next();
        
        String areaCode = num.substring(0, 3);
        String firstThree = num.substring(3, 6);
        String end = num.substring(6);
        
        String phoneNumber = "(" + areaCode + ")" + "-" + firstThree + "-" + end;
        
        System.out.println(phoneNumber);
    }
}
