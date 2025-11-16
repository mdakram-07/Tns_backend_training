public class ExceptionMarksMain {
    public static void main(String[] args) {
        MarksChecker checker = new MarksChecker();
        int[] marksArray = {85, 110, -5, 76};

        for (int marks : marksArray) {
            try {
                checker.checkMarks(marks);
            } catch (InvalidMarks e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}