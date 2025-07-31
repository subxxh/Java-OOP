import java.util.Scanner;
public class problem9 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int x = input.nextInt();

        while(x < 0) {
            System.out.print( "Invalid Input! Try again: ");
            x = input.nextInt();
        }

        int sum = 0;
        while (x > 0) {
            int last = x % 10;

            if (last % 2 != 0) {
                sum += last
            }
        }

    }
}