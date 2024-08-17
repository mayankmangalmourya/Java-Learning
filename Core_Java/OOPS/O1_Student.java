package Core_Java.OOPS;

// Defining Student class.
public class O1_Student{
    // defining fields
    int id;
    String name;
    public static void main(String[] args) {
        // Creating Object or instance.
        O1_Student s1 = new O1_Student();
        System.out.println(s1.id+" "+s1.name); // Access Member through reference variable.
    }
}