package Core_Java.OOPS;

class Student{
    // Fields
    int id;
    String name;
}

public class O2_TestStudent {
    public static void main(String[] args) {
        // Creating Object.
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
