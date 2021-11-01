package member_class;

class Outer {
    public void show(){
        System.out.println("in Outer Class");
    }
    class Inner {
        public void display(){
            System.out.println("in Inner Class");
        }
    }
}
public class InnerDemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
