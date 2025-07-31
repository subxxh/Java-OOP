import java.util.Scanner;
public class problem4 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( " Enter three numbers. ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();

        if (numOne < numTwo && numTwo < numThree) {
            System.out.println( "Increasing." );
        } 
        else if ( numOne > numTwo && numTwo > numThree) {
            System.out.println( "Decreasing." );
        } else {
            System.out.println( "Neither." );
        }

    }
}