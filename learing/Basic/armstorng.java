
// import java.util.Scanner;

// public class A29_Armstrong_no {
//     public static void main(String[] args) {
//         System.out.println("Enter a Num:- ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         double result = 0;
//         double b=3;
//         double reminder;
//         int numcopy = num;
//         int C = long Count(num);
//         while(numcopy!=0){
//             reminder = numcopy%10;
//             result+ = Math.pow(reminder, C);
//             numcopy/ = 10;
//         }
//     }
    
// }

import java.util.*;
public class armstorng {
    public static void main(String[] args) {
        int count=0;
        int sum =0;
        int a,b,c;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int num = Sc.nextInt();
     a=num;
    c = num;
    while(a > 0){
        a= a/10;
        count++;
    }
    while(num>0){
    b = num%10;
    sum = (int) (sum +Math.pow(b,count)) ;
        num = num /10;}
         if(sum==c){
        System.out.println("num is armstorng"+c);
         }
         else{
        System.out.println("num is not armstorng"+c);
         }
    }
}
