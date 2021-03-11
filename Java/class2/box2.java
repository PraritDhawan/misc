import java.util.Scanner;
public class box2 {
  public static void main(String args[]) {
    int x, y, z;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the lenght:");
            x = s.nextInt();
            System.out.print("Enter the breadth:");
            y = s.nextInt();
            System.out.print("Enter the height:");
            z = s.nextInt();
    Box mybox = new Box(x, y, z);
    double vol;

    vol = mybox.volume();
    System.out.println("Volume is " + vol);

  }
}