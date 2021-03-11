abstract class student
{
    int rollno,regno;
    abstract void course();
}    
class kiitian extends student
{    
    void course()
    {
        System.out.println("B.Tech-CSCE");
    }    
}   
public class studcourse
{  
    public static void main(String args[])
    {
        student s;
        s=new kiitian(); 
        s.course();
    }
}