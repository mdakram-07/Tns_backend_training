// driver class
 public class  MarksChecker{
    public void checkMarks(int marks) throws InvalidMarks {
            if(marks < 0 || marks > 100){
                throw new InvalidMarks("Marks should be between 0 and 100");
            } else {
                System.out.println("Valid Marks: " + marks);
        }
    }
    }