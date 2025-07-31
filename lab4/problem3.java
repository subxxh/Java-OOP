import java.util.Scanner;
public class problem3 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( " What is the next item price: ");
        int originalPrice = input.nextInt();
        
        input.close();

        if (originalPrice > 100) {
            int discountedPrice = (int) (originalPrice * 0.6);
            System.out.println( " The item qualifies for a 40% discount. The item's discounted price is $" + discountedPrice + "." );
        }
        else {
             int discountedPrice = (int) (originalPrice * 0.8);
            System.out.println( " The item qualifies for a 20% discount. The item's discounted price is $" + discountedPrice + "." );
        }
    }
}