package Core_Java.OOPS.Inheritance;

class Employee{
    int salary = 10000;
}
class Programmer extends Employee{
    int bonus = 5000;
}
public class I1_Example {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        int total_salary = p.bonus + p.salary;
        System.out.println("Total Salary of Programmer : "+total_salary);
    }
}
