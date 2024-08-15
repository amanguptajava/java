
import java.util.Scanner;

public class A15_marks_grade {
    public static void main(String[] args) {
        System.out.println("Enter precentage :-");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        if(m<=100){
            if(m>90 && m<=100){
                System.out.println("A grade");
            }
            else if(m>70 && m<=91){
                System.out.println("B grade");
            }
            else if(m>40 && m<=71){
                System.out.println("c grade");
            }
            else{
                System.out.println("D grade");
            }
        }
        else{
            System.out.println("Enter precentage under 100 :-");
        }
    }
    
}
