import java.util.Scanner;
public class problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Please enter a positive integer: ");
        int x = input.nextInt();

        while(x <= 0) {
            System.out.print( "Invalid Output! Try again: ");
            x = input.nextInt();
        }

        while(x > 0) {
            System.out.print(x % 2 + " ");
            x /= 2;
        }
        
    }
}