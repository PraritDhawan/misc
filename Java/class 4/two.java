import java.util.Scanner;

public class two {
    void multiply(int a, int b) {
        double m1 = a * b;
        System.out.println("Multiplication of two numbers: " + m1);
    }

    void multiply(double a, double b) {
        double m2 = a * b;
        System.out.println("Multiplication of two numbers: " + m2);
    }

    void multiply(float a, float b) {
        double m2 = a * b;
        System.out.println("Multiplication of two numbers: " + m2);
    }
    public static void main(String[] args) {
        two m = new two();
        m.multiply(36, 20);
        m.multiply(29.5, 30.5);
        m.multiply(43.5, 30.5);
    }
}