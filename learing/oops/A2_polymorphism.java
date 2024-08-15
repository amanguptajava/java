class Rectangle {
      void area(int r){
        System.out.println("radius"+(2*r));
    }
    void area(int l,int b){
        System.out.println("radius"+(l*b));
    }
}

public class A2_polymorphism {
    public static void main(String[] args) {
        Rectangle s1=new Rectangle() ;
        s1.area(10);
        s1.area(10,20);
        
    }
    
}
