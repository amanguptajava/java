import java.util.Scanner;

public class A24_multiply_table {
    public static void main(String[] args) {
        System.out.println("Enter a Num:-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
    public static void table(int n) {
        int i;
        int table;
        for(i=1;i<=10;i++){
            table = n*i;
            System.out.println(+n+"*"+i+"="+table);
        }
    }
// WHITOUT_FUNCION::
// public static void main(String[] args) {
//     System.out.println("Enter a num:-");
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int i;
//     int b;
//     for(i=1;i<=10;i++){
//         b=a*i;
//         System.out.println(+a+"*"+i+"="+b);
//     }
// }
}
       
