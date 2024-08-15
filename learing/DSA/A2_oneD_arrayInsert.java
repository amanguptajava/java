import java.util.Scanner;

public class A2_oneD_arrayInsert {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size of no:- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        int i ;
        System.out.println("Enter the array element:- ");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("oneD_array:- ");
        for(i=0;i<n;i++){
        System.out.print(+a[i]+" ");
        }
        System.out.println("");
        System.out.println("Enter the index value:- ");
        int m = sc.nextInt();
        System.out.println("Enter the value of element:- ");
        int p = sc.nextInt();
        for(i=0;i<n+1;i++){        //1 2 3 4 m=1
            if(i<m){               //i=0 1
                b[i] = a[i];       //i=1 fale
            }
            else if(i==m){         //i=1 m=1
                b[i] = p;          //1 "p" 
            }
            else{                  //1 "p"  b[2]=a[1]                  
                b[i] = a[i-1] ;     // 1 'p' 2 3 4
            }  
        }
        System.out.println("Array:-");
         for(i=0;i<n+1;i++){
            System.out.print(b[i]+" ");
        }
    }
    
}
