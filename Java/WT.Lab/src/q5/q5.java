package q5;

public class q5 {
	public static void main(String[] args) {
	int n=313;
	int r=0,d=n,s=0;
    while(n>0)
    {
        r=n%10;
        s=s*10+r;
        n/=10;
    }
    if(d==s)
    System.out.println("Palindrome");
    else
    System.out.println("Not a Palindrome");}

}
