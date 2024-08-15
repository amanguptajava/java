
import java.util.Scanner;

public class A7_area_of_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the base of triangle:-");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle:-");
        int h = sc.nextInt();
        int c = (b*h)/2;
        System.out.println("Area of triangle:-"+c);

    }
    
}
//perimeter_of_triangle:-a+b+c