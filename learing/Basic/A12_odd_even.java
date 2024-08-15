
import java.util.Scanner;

public class A12_odd_even {
    public static void main(String[] args) {
        System.out.println("Enter the No:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("No is Even");
        }
        else{
            System.out.println("No is odd");
        }
    }
    
}
