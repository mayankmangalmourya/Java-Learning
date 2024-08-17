package Core_Java.OOPS;

class CC_Student{
    int rollNo;
    String name;
    int age;

    public CC_Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public CC_Student(CC_Student s1){
        this.rollNo = s1.rollNo;
        this.name = s1.name;
        this.age = s1.age;
    }
    public void display(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class O8_CopyConstructor {
    public static void main(String[] args) {
        CC_Student obj1 = new CC_Student(1, "raman", 12);
        CC_Student obj2 = new CC_Student(obj1);
        obj2.display();
    }
}
