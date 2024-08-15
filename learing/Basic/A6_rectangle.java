
import java.util.Scanner;

public class A6_rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length of rectangle:-");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("Enter the brigth of rectangle:-");
        int b = sc.nextInt();
        int c = 2*(l+b);
        System.out.println("perimeter of rectangle:-"+c);
    }
 
}
//area_of_rectangle:-l*b
