import java.util.*;
// package Basic;


public class A16_voteing_age {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        if (a>18){
            System.out.println("You are eliglible for vote:");
         } else{
                System.out.println("you are not eliglible for vote:");
            }
        
        }

    }
    

