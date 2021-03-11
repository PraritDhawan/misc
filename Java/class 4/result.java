import java.util.Scanner;
class result extends student{
    int dbms,coa,wt,os;
    void getDetails(){
        System.out.println("enter the marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dbms marks");

        dbms=sc.nextInt();
        System.out.println("enter the coa marks");
        coa=sc.nextInt();

        System.out.println("enter the wt marks");
        wt=sc.nextInt();

        System.out.println("enter the os marks");
        os=sc.nextInt();

    }

    float sgpa(){
        float r;
        r=(((dbms*4)+(os*3)+(wt*3)+(coa*4))/14);
        return r;
    }

}