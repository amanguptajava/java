

import java.util.Scanner;

public class A6_dimand {
    public static void main(String[] args) {
        System.out.println("Enter a num:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for( int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
           
        } 
    }
}


/*
   * 
  * * 
 * * *
* * * *
 * * *
  * *
   *
 */