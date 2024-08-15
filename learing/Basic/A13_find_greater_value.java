
import java.util.Scanner;

public class A13_find_greater_value {
    public static void main(String[] args) {
        System.out.println("Enter the first No:-");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter the second No:-");
        double b = sc.nextDouble();
        System.out.println("Enter the third No:-");
        double c = sc.nextDouble();
        if(a>b && a>c){
            System.out.println("First no is greater"+a);
        }
        else if(b>a && b>c){
            System.out.println("Second no is greater"+b);
        }
        else{
            System.out.println("third no is greater"+c);
        }
    }
    
}
