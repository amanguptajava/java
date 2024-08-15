
import java.util.Scanner;

public class A26_factorial {
    public static void main(String[] args) {
        System.out.println("Enter a num:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=1){
            System.out.println(1);
        }
        else{
            int i=2;
            int fact=1;
            while(i<=num){
                fact = fact*i;
                i++;
            }
            System.out.println("factorial:- "+fact);

        }
    }
}
