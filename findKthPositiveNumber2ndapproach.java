class findKthPositiveNumber2ndapproach {
    public static int findKthPositive(int[] arr, int k) {
        int high = arr.length;
        int low = 0;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - mid - 1;
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + k;
    }



    public static void main(String[] args) {
        // Example usage

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
