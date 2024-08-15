import java.util.Scanner;

public class A22_rightshift {
    public static void main(String[] args) {
        System.out.println("Enter a No:-");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num = num1>>1;
        System.out.println("It is the right shift answer:- "+num);
    }
}
