public class JavaAbstract extends Bike2 {
    void run()
    {
        System.out.println("running...");
    }
    public static void main(String[] args) {
    Bike2 obj=new JavaAbstract();
    obj.run();
    }
}
abstract class Bike{
    abstract void run();
}

