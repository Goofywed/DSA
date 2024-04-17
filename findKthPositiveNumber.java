public class findKthPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else break;
        }
        return k;
    }
    public static void main(String[] args) {
        // Example usage

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
