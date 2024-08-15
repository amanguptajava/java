
import java.util.Scanner;

public class A3_two_no_swap {
    public static void main(String[] args) {
        System.out.println("Enter a first no :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a second no :");
        int b = sc.nextInt();
        System.out.println("before swaping a:-"+a);
        System.out.println("before swaping b:-"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping a:-"+a);
        System.out.println("after swaping b:-"+b);
        sc.close();

    }
    
}
