class s{
    int area;
}
 class Rectangle extends s {
    public Rectangle(int r){
        this.area=2*r;

    }
    public void shape(){
        System.out.println(+area);
    }
}

public class A1_inhertance {
    
    public static void main(String[] args) {
        Rectangle s1=new Rectangle(4);
        s1.shape();

    }
}

