
import java.util.Scanner;

public class A5_operation {
    public static void main(String[] args) {
        System.out.println("Enter A No:-");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter B No:-");
        double b = sc.nextDouble();
        // System.out.println("Enter C No:-");
        // double c = sc.nextDouble();
        System.out.println("ADD:-"+(a+b));
        System.out.println("SUB:-"+(a-b));
        System.out.println("MUL:-"+(a*b));
        System.out.println("DIV:-"+(a/b));
    }
    
}
