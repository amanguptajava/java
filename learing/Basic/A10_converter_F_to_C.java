
import java.util.Scanner;

public class A10_converter_F_to_C {
    public static void main(String[] args) {
        System.out.println("Enter the Fahrenheit:-");
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double c = ((F-32)*5)/9;
        System.out.println("Celsius:-"+c);

              //for_converter_C_to_F
    //    System.out.println("Enter the celsius:-");
    //    double C = sc.nextDouble();
    //    double F = (C*9/5)+32;
    //    System.out.println("Celsius:-"+F);      

    }
    
}
