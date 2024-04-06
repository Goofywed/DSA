import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
//        findDuplicate(arr);
//        findduplicatewithboolean(arr);
        
        List<Integer> duplicates = FindDuplicatewithlimit(arr);
        System.out.println("Duplicates: " + duplicates);
    }

            // array with anylength. o(n) o(1)

    public static void findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; // Adjust index to be zero-based
            if (arr[index] > 0) {
                arr[index] = -arr[index]; // Mark the number as visited by negating it
            } else {
                // If the number is already negative, it means it's a duplicate
                System.out.println(Math.abs(arr[i]));
            }
        }
    }


                // array contains elements only between 1 to n o(n) o(1)

    public static List<Integer> FindDuplicatewithlimit(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) {
                ans.add(x);
            }
            nums[x - 1] *= -1;
        }
        return ans;
    }


                // o(n) and O(n)

    public static void findduplicatewithboolean(int arr[]){
        boolean [] result= new boolean[arr.length];
        for (int i=0;i< arr.length;i++){
            int num=arr[i];
            if (result[num]){
                System.out.println(num);
            }else result[num]=true;
        }
    }
}
