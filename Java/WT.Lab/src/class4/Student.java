package class4;

import java.util.Scanner;

public class Student {

	 int rno;
     String name;
     void details()
     {
         System.out.println("Enter Name");
         Scanner in=new Scanner(System.in);
         name=in.nextLine();
         System.out.println("Enter Roll No.");
         rno=in.nextInt();
     }
     void print()
     {
         System.out.println("Name:"+name);
         System.out.println("Roll:"+rno);
     }
}
class Result extends Student
{
    int dbms,coa,wt,os;
    void getDetails()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter DBMS Marks:");
        dbms=in.nextInt();
        System.out.println("Enter COA Marks:");
        coa=in.nextInt();
        System.out.println("Enter WT Marks:");
        wt=in.nextInt();
        System.out.println("Enter OS Marks:");
        os=in.nextInt();
    }
    float Sgpa()
    {
        float r;
        r=(((dbms*4)+(os*3)+(wt*3)+(coa*4))/14);
        return r;
    }
}
