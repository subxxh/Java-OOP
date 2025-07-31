import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a positive integer: " );
        int i = input.nextInt();

        while (i < 1) {
            System.out.print( "Bad input! Try again: ");
            i = input.nextInt();
        }

        for (int x = i; x > 0; x/= 10) {
            int digit = x % 10;
            if (digit == 5) {
            System.out.print( "The number contains the digit 5." );
            break;
            } else {
            System.out.print( "The number does not contain the digit 5." );
            break;
            }
        }             
    }
}