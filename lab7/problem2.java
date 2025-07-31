import java.util.Scanner;
public class problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a number between 1 and 100: " );
        int i = input.nextInt();

        while (i < 1 || i > 100) {
            System.out.print( "Bad input! \nEnter a number between 1 and 100: ");
            i = input.nextInt();
        }

        System.out.print( "The first 20 multiples of " + i + " are ");
        int multiple;
        for (int x = 1; x < i * 20; x++) {
            multiple = i * x;
            System.out.print( " " + multiple);
        } 
    }
}