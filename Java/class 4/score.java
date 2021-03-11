import java.util.Scanner;
class score{
    public static void main(String args[]) {
       result r=new result();
       result.details();
       result.getDetails();
        System.out.println("\tTHE RESULT:");
        r.print();
        float c=r.sgpa();
        System.out.println("SGPA:" + c);
    }

}