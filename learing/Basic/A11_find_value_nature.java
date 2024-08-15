
import java.util.Scanner;

public class A11_find_value_nature {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Number is positive:-");
        }
        else if(n==0){
            System.out.println("Number is zero:-");
        }
        else{
            System.out.println("Number is negetive:-");
        }
    }
    
}
