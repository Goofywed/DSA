import static java.lang.Math.max;

public class maxGuestsWithinTimesss {
    public static void main(String[] args) {
        int[] E = {7, 0, 5, 1, 3};  // Number of guests entering each hour
        int[] L = {1, 2, 1, 3, 4};    // Number of guests leaving each hour
        int T = 5;                  // Total hours

        System.out.println("Maximum number of guests: " + maxGuestsWithinTime(E, L, T));
    }

    private static int maxGuestsWithinTime(int[] E, int[] L, int T) {
        int maxGuests = 0;
        int currentGuests = 0;

        for (int i = 0; i < T; i++) {
            currentGuests += E[i] - L[i];
            maxGuests = Math.max(maxGuests, currentGuests);
        }

        return maxGuests;
    }
}
