
import java.util.Scanner;

public class A1_oneD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size of no:- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i ;
        System.out.println("Enter the array element:- ");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("oneD_array");
        for(i=0;i<n;i++){
        System.out.print(+a[i]+" ");
        }
    }

}
