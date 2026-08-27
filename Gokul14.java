public class Gokul14 {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ravi", 45000.0);
        Employee e2 = new Employee(102, "Priya", 52000.0);


        e1.display();
        e2.display();


        Employee.displayCompanyName(); 
    }
}

class Employee {

    private int empId;
    private String name;
    private double salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    public void display() {
        System.out.printf("ID: %d | Name: %s | Salary: %.2f%n", this.empId, this.name, this.salary);
    }

  
    public static void displayCompanyName() {
        System.out.println("ANITS Engineering College");
    }
}
