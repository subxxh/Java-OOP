import java.util.Scanner;
public class problem3 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.print(" Enter an integer between 1 and 20: ");
        int n = input.nextInt();
        int count = 0;

        while (n < 1 || n > 20) {
            System.out.print( "Out of range. Enter an integer between 1 and 20: ");
            n = input.nextInt();
            count++;
            if (count > 9) {
                n = 10;
            }
        }

        int cube = n * n * n;
        System.out.print( "The cube of your integer is " + cube);

    
    }
}