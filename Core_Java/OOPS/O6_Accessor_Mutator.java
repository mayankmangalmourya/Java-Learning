package Core_Java.OOPS;

class AM_Student{
    private int rollNo;
    private String name;
    // Accessor/Getter Method.
    public int getRollNo(){
        return rollNo;
    }
    // Mutator/Setter Method.
    public void setRollNo(int roll){
        this.rollNo = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class O6_Accessor_Mutator {
    public static void main(String[] args) {
        AM_Student student = new AM_Student();
        student.setRollNo(10);
        student.setName("Rahul");
        System.out.println("Roll No: "+student.getRollNo());
        System.out.println("Name: "+student.getName());
    }
}
