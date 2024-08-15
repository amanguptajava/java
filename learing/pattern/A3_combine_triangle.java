
import java.util.Scanner;

public class A3_combine_triangle {
     public static void main(String[] args) {
        System.out.println("Enter a no:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++){
            for( int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
