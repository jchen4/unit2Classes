import java.util.Scanner;

public class Scannum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = s.next();
        int index = num.indexOf(",");
        String numsub1 = num.substring(0,index);
        String numsub2 = num.substring(index+1);
        String newnum = numsub1 + numsub2;
        System.out.println(newnum);
    }
}
