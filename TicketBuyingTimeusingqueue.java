import java.util.LinkedList;
import java.util.Queue;

public class TicketBuyingTimeusingqueue {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<tickets.length;i++){
            queue.add(i);
        }

        int time=0;
        while (!queue.isEmpty()){
            time++;
            int person= queue.poll();
            if (tickets[person]>=1){
                tickets[person]--;
            }
            if (person==k && tickets[person]==0){
                break;
            }

            if (person !=k && tickets[person]==0) continue;
            queue.add(person);
        }
        return time;

    }

    public static void main(String[] args) {
        // Example usage
        int[] tickets = {5, 1, 1, 1};
        int k = 0;

        int totalTime = timeRequiredToBuy(tickets, k);
        System.out.println("Total time required to buy tickets: " + totalTime);
    }
}
