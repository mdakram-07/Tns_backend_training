// Demo class for types of variable
 class Student{
    // instance variable
    int rollNo;
    String name;
    String branch;
    static String collegeName="AVN";
    void Print(){
        // Local variable
        String msg="Welcome to avn college";
        System.out.println(msg);
        System.out.println("The details of Students are " + " " +rollNo + " " + name + " " + branch + " " + collegeName);
    }
}

// Execution class 
public class StudentName{
    public static void main(String args[]){
        // Object creation        
       // Accessing instance variable using object
        Student s1=new Student();
        s1.rollNo=100;
        s1.name="Akram";
        s1.branch="CSE";
        s1.Print();
        System.out.println(Student.collegeName);
        Student s2=new Student();
        s2.rollNo=101;
        s2.name="Fasi";
        s2.branch="EEE";
        s2.Print();
    }
}