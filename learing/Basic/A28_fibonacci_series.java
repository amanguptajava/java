
import java.util.Scanner;



public class A28_fibonacci_series {
    public static void main(String[] args) {
        System.out.println("Enter a num:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci_series(num);
    }
    public static void fibonacci_series(int n) {
        int first=0,second=1;
        System.out.print(first+" "+second+" ");
        // System.out.print(first+" ");
        // if(n<=0){
        //     System.out.print(first+"");
        // }
        // else if(n==1){
        //     System.out.print(+first+""+second);
        // }
        // else{
            int third  ,i=2;
            while (i<n) {
                third = first+second;
                first=second;
                second=third;
                i++;
                System.out.print(third+" ");
            // }
        }
    }
    
}
