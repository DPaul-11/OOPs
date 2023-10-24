public class JavaPolymorphism {
    public static void main(String[] args) {
       //overriding
        Bike1 obj=new Bike1();

        obj.run();

        //overloading
//        Overloading ob=new Overloading();
//        ob.add(10,20);
//        ob.add(10,20,30);

    }
}
class Vehicle{
    void run()
    {
        System.out.println("Vehicle is running...");
    }
}
class Bike1 extends Vehicle {
    void run()
    {
        System.out.println("Bike is running...");
    }
}
//class Overloading{
//    void add(int a, int b)
//    {
//        System.out.println(a+b);
//    }
//    void add(int a, int b, int c)
//    {
//        System.out.println(a+b+c);
//    }
//}

