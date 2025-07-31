import java.util.Scanner;
public class problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter an angle in degrees: " );
        double angleOne = input.nextDouble();
        
        System.out.println( "Enter an angle in degrees: " );
        double angleTwo = input.nextDouble();

        System.out.println( "Enter an angle in degrees: " );
        double angleThree = input.nextDouble();

        if (angleOne + angleTwo + angleThree == 180) {
            System.out.println( "Can form a triangle from these angles." );

            if (angleOne == 90 || angleTwo == 90 || angleThree == 90) {
                System.out.println( "This triangle is a right triangle." );
            } 
            else if (angleOne == 60 && angleTwo == 60 && angleThree == 60) {
                System.out.println( "This triangle is an equilateral triangle." );
            } else {
                System.out.println( "This triangle is neither equilateral nor right." );
            }
         } else {
            System.out.println( "Cannot form a triangle from these angles." );
        }
    }
}