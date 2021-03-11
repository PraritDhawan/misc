import java.util.*;
class twod
{
    int l,b;
    void price(int len,int bre)
    {
        l=len;b=bre;
        System.out.println("Total Cost="+(40*l*b));
    }
}
class threed extends twod
{
    int h;
    void price1(int len,int bre,int hei)
    {
        l=len;b=bre;h=hei;
        System.out.println("Total Cost="+(60*l*b*h));
    }
}