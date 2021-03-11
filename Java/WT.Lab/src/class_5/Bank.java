package class_5;

import java.util.*;
abstract class Bank
{    
    float ROI;
    abstract float find_ROI(float ap);
}    
class HDFC extends Bank
{    
    float find_ROI(float ap)
    {
        ROI=ap/15000000;
        return ROI;
    }
}    
class ICICI extends Bank
{     
    float find_ROI(float fs)
    {
        ROI=fs/10000000;
        return ROI;
    }
}    
public class TestBank
{    
    public static void main(String args[])
    {    
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Last Year Annual Profit:");
        float ap=in.nextFloat();
        System.out.print("Enter Enter Fund Supported by RBI:");
        float fs=in.nextFloat();
        Bank b;  
        b=new HDFC();  
        System.out.println("Rate of Interest of HDFC is: "+b.find_ROI(ap)+" %");    
        b=new ICICI();  
        System.out.println("Rate of Interest of ICICI is: "+b.find_ROI(fs)+" %");    
    }
}