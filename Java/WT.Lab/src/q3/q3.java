package q3;

public class q3 {
	public static void main(String[] args) {

    float marks=78f;
    char grade=0;
    if(marks >=90 && marks <=100)
    grade='O';
    else if(marks >=80 && marks <90)
    grade='E';
    else if(marks >=70 && marks <80)
    grade='A';
    else if(marks >=60 && marks <70)
    grade='B';
    else if(marks >=50 && marks <60)
    grade='C';
    else if(marks >=40 && marks <50)
    grade='D';
    else if(marks >=0 && marks <40)
    grade='F';
    System.out.println("Your grade is : "+grade);}

}
