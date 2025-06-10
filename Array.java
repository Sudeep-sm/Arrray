
public class Array {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) sum(arr) / arr.length;
    }

public static int min(int[] arr) {
        if (arr.length == 0) {
            
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
public static int max(int[] arr) {
        if (arr.length == 0) {
            
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
 public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));
    }
}
