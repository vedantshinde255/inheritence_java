class Vehicle {
    void start()
    {
        System.out.println("This is Vehicle");
    }
}

class car1 extends Vehicle {
    void drive() {
        System.out.println("This is Car");
    }
}
class bike1 extends Vehicle {
    void ride()
    {
        System.out.println("This is Bike");
    }
}
class bus extends Vehicle {
    void pass()
    {
        System.out.println("This is Bus");
    }
}
public class Hierarchical_inheritance {
    public static void main(String[] args)
    {
        car1 c=new car1();
        c.start();
        c.drive();

        bike1 b=new bike1();
        b.start();
        b.ride();

        bus bus=new bus();
        bus.start();
        bus.pass();
    }
}