
import java.util.Scanner;

class Divide_two_nos
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter two number for dividing: ");
            try
            {
                System.out.printf("Result: %d\n\n", in.nextInt()/in.nextInt());
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Cannot divide with zero\n");
            }
            finally
            {
                System.out.println("Program ended without Errors.");
                System.out.println("Enter 1 to Retry and 0 to exit the Program.");
                int uin=in.nextInt();
                if(uin==1)
                continue;
                else
                {
                    System.out.println("Exited from program.");
                    break;
                }
            }
        }
    }
}