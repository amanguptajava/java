
import java.util.Scanner;

public class A23_bitwise_even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & 1) == 1){
            System.out.println("Number is odd:- ");
        }
        else{
            System.out.println("Number is even");
        }
    }
    
}
