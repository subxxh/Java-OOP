import java.util.Scanner;
public class problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a positive integer: ");
        int x = input.nextInt();
        while (x < 0) {
            System.out.print( "Invalid input! Try again: ");
            x = input.nextInt();
        }

        int odd = 0;
        while (x > 0) {
            int lastdigit = x % 10;

            if(lastdigit % 2 != 0) {
                odd = odd + lastdigit;
            }
                  x = x / 10;
        }
        System.out.println( "The sum of the odd digits in the number is " + odd);
        
    }
}