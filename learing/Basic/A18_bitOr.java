import java.util.Scanner;

public class A18_bitOr {
    public static void main(String[] args) {
        System.out.println("Enter a first  no:- ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter a second  no:- ");
        int num2 = sc.nextInt();
        int num = num1 | num2;
        System.out.println("It is the  Or operation answer:-"+num);
    }
    
}
