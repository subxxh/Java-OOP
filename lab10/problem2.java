import java.util.Scanner;
public class problem2 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
            
            System.out.print( "Enter two positive integers with a difference of at least 10: ");
            int n = input.nextInt();
            int n2 = input.nextInt();

            while (Math.abs(n - n2) < 10) {
                System.out.print( "Invalid input! Try again: ");
                n = input.nextInt();
                n2 = input.nextInt();
            }

            int random = (int) (Math.random() * (n2 - 1 + n) + n);
            System.out.print( "Random integer between " + n + " and " + n2 + " is " + random);

        }
    }
