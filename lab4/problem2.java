import java.util.Scanner;
public class problem2 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( " What is the original price? ");
        int originalPrice = input.nextInt();

        input.close();

        if (originalPrice > 125) {
            int discount = (int) (originalPrice * 0.9);
            System.out.println( " The reduced price is $" + discount + "." );
        }
        else {
            System.out.println( " That does not qualify for a discount. The price is $" + originalPrice + "." );
        }

    }
}