
import java.util.Scanner;

public class A8_simple_Interest {
    public static void main(String[] args) {
        System.out.println("Enter the principle:-");
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        System.out.println("Enter the rate_of_interest:-");
        int R = sc.nextInt(); 
        System.out.println("Enter the time:-"); 
        int T = sc.nextInt();
        int c= P*R*T;
        System.out.println("Simple Interest:-"+c);
    }
    
}
