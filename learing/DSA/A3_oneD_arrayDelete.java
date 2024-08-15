import java.util.Scanner;

public class A3_oneD_arrayDelete {
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

              // System.out.print("oneD_array :- ");
              // for(i=0;i<n;i++){
              // System.out.print(a[i]+" ");
              // }
              // System.out.println("");
              int b[] = new int [n-1];
            System.out.println("Enter the index value");
            int m=sc.nextInt();
            for(i=0;i<a.length;i++){
               if(i<m){               // 1 2 3 m=1
                b[i]=a[i];            //i=0 1 
               }                      // i=1 false         
               else if(i==m){         // i=1 m=1       
                continue;          // 1
               }
               else{
                b[i-1]=a[i];      //i=2 
               }                        // b[1]=a[2]
            }
        System.out.println("updated array is:- ");
        for(i=0;i<n-1;i++){
            System.out.print(b[i]+" "); 
        }
    }
    
}
