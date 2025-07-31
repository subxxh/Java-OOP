import java.util.Scanner;
public class problem5{

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
        Tosses(10);
        Tosses(100);
        Tosses(1000);
        Tosses(10000);
    }

        public static void Tosses(int tosses) {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < tosses; i++) {
            int toss = (int) (Math.random() * 2);
            if (toss == 0) {
                heads++;
                } else {
                tails++;
                }
        }

        double headsProbability = (double) heads / tosses;
        double tailsProbability = (double) tails / tosses;

        System.out.println("Probability of heads given " + tosses + " tosses = " + headsProbability);
        System.out.println("Probability of tails given " + tosses + " tosses = " + tailsProbability);
        System.out.println();
        
    }
}