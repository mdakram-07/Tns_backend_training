// Class FullTimeEmployee implementing Employee interface
public class FullTimeEmployee implements Employee {

    // Data members
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee details
    public FullTimeEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display employee details
    public void getDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + salary);
    }
    }