import java.util.Scanner;
public class problem1 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.print( "Enter an integer greater than or equal to 10: ");
    int n = input.nextInt();

    while(n < 10) {
        System.out.print( "Invalid input! Try again: ");
        n = input.nextInt();
    }

    int r = (int)(Math.random() * n  + 1);
    System.out.println(r);

    }
}