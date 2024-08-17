package Core_Java.OOPS.Aggregation;

class A1_Address{
    int houseNo;
    String street;
    String city;
    String state;
    String country;
    String pincode;
    public A1_Address(
        int houseNo, 
        String street, 
        String city, 
        String state, 
        String country, 
        String pincode
    ){
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

class A1_Employee{
    int empId;
    String empName;
    A1_Address address;
    public A1_Employee(
        int empId,
        String empName,
        A1_Address address
    ){
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }
    public void displayInfo(){
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Address: ");
        System.out.println(address.houseNo+" "+address.street+" "+address.city+" "+address.state);
        System.out.println(address.country+" "+address.pincode);
    }
}

public class A1_Example{
    public static void main(String[] args) {
        A1_Address address = new A1_Address(1,"Indira","Shivpuri","Mp","India","473441");
        A1_Employee emp = new A1_Employee(1,"Rahul",address);
        emp.displayInfo();
    }
}
