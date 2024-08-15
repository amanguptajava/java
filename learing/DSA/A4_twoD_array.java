
import java.util.Scanner;

public class A4_twoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row");
        int a=sc.nextInt();
        System.out.println("Enter the no of coloum");
        int b = sc.nextInt();

        int A[][]=new int[a][b];
        System.out.println("Enter your element");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                 A[i][j]=sc.nextInt();
            }
        }
        System.out.println("element arry");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                 System.out.print(A[i][j]);
            }
            System.out.println();
        }

    }
    
}
