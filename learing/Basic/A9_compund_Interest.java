import java.util.Scanner;

public class A9_compund_Interest {
    public static void main(String[] args) {
        System.out.println("Enter the principle:-");
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        System.out.println("Enter the rate_of_interest:-");
        double R = sc.nextDouble(); 
        System.out.println("Enter the time:-"); 
        int T = sc.nextInt();
        // System.out.println("Enter the no_of_time_interest:-");
        // int n = sc.nextInt();
        double c = P*(Math.pow((1+R/100),T));
        System.out.println("Compund_Interest:-"+c);
    }
    
}
