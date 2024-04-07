import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2,7, 2, 3, 4, 4, 5};
//        Arrays.sort(nums);
//        int length=removeDuplicates(nums);
        int length = SETremoveDuplicates(nums);

        System.out.println("Length without duplicates: " + length);
        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0; // Pointer to track the position to overwrite next non-duplicate element
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++; // Increment j to move to the next position
                nums[j] = nums[i]; // Overwrite next non-duplicate element
            }
        }
        return j + 1; // Return the length of the modified array
    }

    public static int SETremoveDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        Set<Integer> set = new HashSet<>();
        int j = 0;

        for (int num : nums) {
            if (!set.contains(num)) {
                nums[j++] = num;
                set.add(num);
            }
        }

        return j;
    }
}
