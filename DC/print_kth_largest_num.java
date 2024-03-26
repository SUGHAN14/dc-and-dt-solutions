import java.util.*;

public class KthLargest {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 2};
        int k = 3;

        int kthLargest = findKthLargest(arr, k);

        System.out.println("The " + k + "-th largest number is: " + kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        // Create a HashSet to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Convert HashSet to array
        Integer[] uniqueNums = set.toArray(new Integer[0]);

        // Sort the array in ascending order
        Arrays.sort(uniqueNums, (a, b) -> a - b);

        // Return the k-th largest number
        return uniqueNums[uniqueNums.length - k];
    }
}
