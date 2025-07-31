import java.util.Scanner;
public class problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter a number and I will tell you if it is even or odd.");
        System.out.println( "Enter a negative number to stop: ");
        int num = input.nextInt();

        while (num >= 0) {
            System.out.println( "> " + num );

            if (num % 2 == 0) {
                System.out.println( "Even" );
            } else {
                System.out.println( "Odd" );
            } 
        
            num = input.nextInt();
        }
        
            System.out.println( "Goodbye." );
        
    }
}