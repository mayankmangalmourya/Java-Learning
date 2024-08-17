package Core_Java.OOPS;

class Employee{
    int id;
    String name;
    float salary;
    public Employee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("----------------------------------");
    }
}

public class O4_TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 104332.0f);
        Employee emp2 = new Employee(102, "Jane", 104332.0f);
        emp1.display();
        emp2.display();
    }
}
