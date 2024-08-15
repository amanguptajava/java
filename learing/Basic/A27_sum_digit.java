
import java.util.Scanner;

public class A27_sum_digit {
    public static void main(String[] args) {
        System.out.println("Enter a Num:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Sum_digit(num);
    }
    public static void Sum_digit(int n){
        int sum =0;
        while(0<n){
            sum+=n%10;
            n/=10;
        }
        System.out.println("it is the sum_of_digit:- "+sum);
    }

    
}
