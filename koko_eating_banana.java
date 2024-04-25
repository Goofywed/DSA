import java.util.*;
public class koko_eating_banana {
    public static int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=0;
        for(int pile:piles){
            maxspeed=Math.max(maxspeed,pile);
        }

        while(minspeed<maxspeed){
            int mid=(minspeed+maxspeed)/2;
            if(eatintime(piles,h,mid)){
                maxspeed=mid;
            }else{
                minspeed=mid+1;
            }

        }
        return minspeed;}
    private static boolean eatintime(int[] piles, int h, int mid){
        int hours=0;
        for(int pile:piles){
            hours+=(int)Math.ceil((double)pile/mid);
        }
        return hours<=h;
    }

        public static void main(String[] args) {
            // Create a Scanner to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Read the number of piles
            System.out.println("Enter the number of piles:");
            int n = scanner.nextInt();

            // Read the size of each pile
            System.out.println("Enter the size of each pile (space-separated):");
            int[] piles = new int[n];
            for (int i = 0; i < n; i++) {
                piles[i] = scanner.nextInt();
            }

            // Read the number of hours
            System.out.println("Enter the number of hours (h):");
            int h = scanner.nextInt();



            // Call the minEatingSpeed method
            int minSpeed = minEatingSpeed(piles, h);

            // Print the minimum eating speed
            System.out.println("Minimum eating speed: " + minSpeed);
        }
    }


