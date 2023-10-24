public class JavaInheritence {
    public static void main(String[] args) {
    Dog obj=new Dog();
    obj.bark();
    obj.eat();
    }
}
class Animal{
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Animal2 {
    void bark()
    {
        System.out.println("barking...");
    }
}
