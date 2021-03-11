import java.util.*;
class Manager
{
    int departmentId;
    int Employee;
    void managerEncash(int dayno)
    {
	System.out.println("The Leave Encashment of Manager is: "+(dayno*400));
    }
}
class Worker extends Manager
{
    void WorkerEncash(int dayno)
    {
	System.out.println("The Leave Encashment of Worker is: "+(dayno*300));
    }
}
class Other extends Manager
{
    void OtherEncash(int dayno)
    {
	System.out.println("The Leave Encashment of Others are: "+(dayno*200));
    }
}
public class JAVA_LAB4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of Days:");
	int dayno=sc.nextInt();
	Other obj=new Other();
	obj.OtherEncash(dayno);
	Worker obj1=new Worker();
	obj1.WorkerEncash(dayno);
	Manager obj2=new Manager();
	obj2.managerEncash(dayno);
    }
}