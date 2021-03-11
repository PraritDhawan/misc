import java.util.Scanner;
public class name
{
    public static void main(String[] args)
    {
        String a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first name:");
        a = s.nextLine();
        System.out.print("Enter last name:");
        b = s.nextLine();
        name obj = new  name();
        c = obj.concat(a, b);
        System.out.println("Full name:"+c);
    }
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }
}