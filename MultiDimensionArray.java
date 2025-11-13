public class MultiDimensionArray{
    public static void main(String[] args) {
        // Declare a 2D array of integers
        int[][] num = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and display each element of the 2D array
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Element at (" + i + "," + j + "): " + num[i][j]);
            }
        }

        // enhanced for loop for 2D array
        for (int[] row : num) {
            for (int element : row) {
                System.out.println("Element: " + element);
            }
        }
    }
}