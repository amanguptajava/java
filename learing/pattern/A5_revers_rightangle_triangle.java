
import java.util.Scanner;

public class A5_revers_rightangle_triangle {
    public static void main(String[] args) {
        System.out.println("Enter a num:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
           
        }   
    }
}
/* 
****
 ***
  **

*/


/* 
* * * * * 
 * * * *
  * * *
   * *
    *
*/