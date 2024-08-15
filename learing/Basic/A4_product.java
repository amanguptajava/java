
import java.util.Scanner;

public class A4_product {
    public static void main(String[] args) {
        System.out.println("Enter first no:-");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second no:-");
        int b = sc.nextInt();
        System.out.println("product of two no:-"+(a*b));
        sc.close();
    }
    
}
