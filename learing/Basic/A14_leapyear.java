import java.util.*;
// package Basic;

public class A14_leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0 || a%4==0 && a%100!=0){
            System.out.println("leap year");

        }
        else{
            System.out.println("not leap year");
            sc.close();
        }
    }
    
}
