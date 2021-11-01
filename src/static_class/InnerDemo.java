package static_class;
class Outer {
    static int a;
    public static void show(){
        System.out.println("in Outer Class");
    }
    static class Inner{
        public static void display(){
            System.out.println("in Inner Class");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer.show();
        Outer.Inner.display();
    }
}
