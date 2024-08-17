package Core_Java.OOPS.Inheritance;

// Single Level Inheritance.
class singleLevel_Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends singleLevel_Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

// Multi Level Inheritance.
class MultiLevel_Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog1 extends MultiLevel_Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class puppy extends Dog1{
    void cry(){
        System.out.println("Crying...");
    }
}

// Heirarchical Inheritance.
class Heirarchical_Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Lion extends Heirarchical_Animal{
    void roar(){
        System.out.println("Roaring...");
    }
}
class Tiger extends Heirarchical_Animal{
    void roar(){
        System.out.println("Roaring...");
    }
}

public class I2_Inheritance {
    public static void main(String[] args) {
        // Single Level Inheritance
        System.out.println("Single Level Inheritance");
        Dog d = new Dog();
        d.eat();
        d.bark();
        // Multi Level Inheritance
        System.out.println("Multi Level Inheritance");
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.cry();
        // Heirarchical Inheritance.
        System.out.println("Heirarchical Inheritance");
        Lion l = new Lion();
        l.eat();
        l.roar();
        Tiger t = new Tiger();
        t.eat();
        t.roar();
    }
}
