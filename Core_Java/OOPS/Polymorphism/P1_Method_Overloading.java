package Core_Java.OOPS.Polymorphism;

// By changing no. of arguments.
class Adder{
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
}

// By changing data type of arguments.
class Multiplier{
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
}

public class P1_Method_Overloading {
    public static void main(String[] args) {
        // By changing the no of arguments.
        Adder adder = new Adder();
        System.out.println(adder.add(10, 20)); // 30
        System.out.println(adder.add(10, 20, 30)); // 60

        // By changing the data type of arguments.
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(10, 20)); // 200
        System.out.println(multiplier.multiply(10.5, 20.5)); // 215.25
    }
}
