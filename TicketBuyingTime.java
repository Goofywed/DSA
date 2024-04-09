public class TicketBuyingTime {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;

        for (int i = 0; i < tickets.length; ++i) {
            if (i <= k) {
                ans += Math.min(tickets[i], tickets[k]);
            } else {
                ans += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        int[] tickets = {5, 1, 1, 1};
        int k = 0;

        int totalTime = timeRequiredToBuy(tickets, k);
        System.out.println("Total time required to buy tickets: " + totalTime);
    }
}
