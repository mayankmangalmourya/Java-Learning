package Core_Java.OOPS;

class OI_Student1{
    int id;
    String name;
}

class OI_Student2{
    int id;
    String name;
    // Method.
    void insertRecord(int rollNo, String student_name){
        id = rollNo;
        name = student_name;
    }
    void displayRecord(){
        System.out.println(id+" "+name);
    }
}

class OI_Student3{
    int id;
    String name;
    // Constructor
    public OI_Student3(int id, String name){
        this.id = id;
        this.name = name;
    }
    void displayRecord(){
        System.out.println(id+" "+name);
    }
}


public class O3_Object_Initialize {
    public static void main(String[] args) {
        // Initialize by reference.
        OI_Student1 s1 = new OI_Student1();
        s1.id = 1;
        s1.name = "John";
        System.out.println("Initialize By Reference\n"+s1.id + " " + s1.name);
        // Initialize by method.
        OI_Student2 s2 = new OI_Student2();
        s2.insertRecord(2, "Doe");
        System.out.println("Initialize By Method.");
        s2.displayRecord();
        // Initialize By Constructor.
        OI_Student3 s3 = new OI_Student3(3, "Jane");
        System.out.println("Initialize By Constructor.");
        s3.displayRecord();
    }
}
