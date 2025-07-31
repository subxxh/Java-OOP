import java.util.Scanner;
public class problem1 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

        System.out.print( "Enter a number between 2 and 5: ");
        int x = input.nextInt();

        while ( x < 2 || x > 5) {
            x = input.nextInt();
        }

        int power = 1;
        for (int i = 1; i <= 10; i++) {
        power = power * x;
        System.out.print(power + " ");
        }
    }

}