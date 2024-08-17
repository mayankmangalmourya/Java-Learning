package Core_Java.OOPS;

abstract class Demo{
    abstract void display();
}
public class O7_Abstract extends Demo {
    void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Demo obj = new O7_Abstract();
        obj.display();
    }
}
