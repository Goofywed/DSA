import java.util.Scanner;
import java.util.ArrayList;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            newArr.add(scanner.nextInt());
        }

        // Input value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Find missing numbers
        ArrayList<Integer> missArr = new ArrayList<>();
        int a = 1;
        while (missArr.size() < (k + n)) {
            if (!newArr.contains(a)) {
                missArr.add(a);
            }
            a++;
        }

        // Output kth missing number
        System.out.println("The kth missing term is " + missArr.get(k - 1));

        // Output arrays
        System.out.println("Original array: " + newArr);
        System.out.println("Missing numbers: " + missArr);
    }
}
