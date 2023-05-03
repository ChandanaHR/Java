Create an abstract class pen with methods write () and refill () as abstract methods 
Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 
abstract class pen {
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen {
    void write()
    {
        System.out.println("Write");
    }
    void refill()
    {
        System.out.println("Refill");
    }
    void changenib()
    {
        System.out.println("Changenib");
    }
}
class monkey {
    void jump()
    {
        System.out.println("Jumping...");
    }
    void bite()
    {
        System.out.println("Biting...");
    }
}
interface basicanimal {
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak()
    {
        System.out.println("Speaking..");
    }
    public void eat()
    {
        System.out.println("Eating...");
    }
    public void sleep()
    {
        System.out.println("Sleeping...");
    }
}

public class Main {
    public static void main(String [] args)
    {
        fountainpen pen = new fountainpen();
        pen.write();
        pen.refill();
        pen.changenib();
        
        monkey m1 = new human();
        m1.jump();
        m1.bite();
        
        basicanimal b1 = new human();
        b1.eat();
        b1.sleep();
        
        human harry = new human();
        harry.speak();
    }
}
