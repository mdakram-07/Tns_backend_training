import java.util.Arrays;
public class SingleArray{
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and display each element of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        // enhanced for loop
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
        // sorting the array
        int [] nums={5,3,8,1,2};
        Arrays.sort(nums);
        System.out.println("Sorted array:");
        for(int n:nums){
            System.out.println(n);
        }
    }
}