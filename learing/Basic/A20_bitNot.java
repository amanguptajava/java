import java.util.Scanner;

public class A20_bitNot {public static void main(String[] args) {
        System.out.println("Enter a first  no:- ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        // System.out.println("Enter a second no:- ");
        // int num2 = sc.nextInt();
        int num = ~num1;
        System.out.println("It is the Not operation answer:-"+num);
    }
    
}
