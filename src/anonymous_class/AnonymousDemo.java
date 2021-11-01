package anonymous_class;
class Vehicle {
    public void run(){
        System.out.println("Vehicle is Moving!!");
    }
}


public class AnonymousDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(){
            public void run() {
                System.out.println("Bike is Moving!!");
            }
        };
        vehicle.run();

    }
}
