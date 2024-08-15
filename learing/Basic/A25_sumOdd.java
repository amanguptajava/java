
import java.util.Scanner;

public class A25_sumOdd {
    public static void main(String[] args) {
        System.out.println("Enter a num:-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Odd_no_sum(num);
    }
    public static void Odd_no_sum(int n) {
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            System.out.println(i);
            i+=2;  
        }
        System.out.println("odd num sum is:- "+sum);
    }       
    
    
    
}
