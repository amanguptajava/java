
import java.util.Scanner;

public class A17_bitAnd {
    public static void main(String[] args) {
        System.out.println("Enter a first binary no:- ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter a second binary no:- ");
        int num2 = sc.nextInt();
        int num = num1 & num2;
        System.out.println("It is the binary And operation answer:-"+num);
    }
    
}
