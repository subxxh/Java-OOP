import java.util.Scanner;
public class problem4 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0, price = -1;
    while(price != 0) {
        System.out.print( " Enter the price of an item: ");
        price = input.nextInt();
        total += price;
    }
    System.out.println( "Your checkout total is $" + total);
    if (total > 100) {
        System.out.println( "That's expensive!" );
    }
    
    }
}