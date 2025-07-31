import java.util.Scanner;
public class problem1 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter hurricane category: " );
        int category = input.nextInt();

        if (category == 1) {
            System.out.println( "The wind speed is 74-95 mph!" );
        }
         else {
            if (category == 2) {
                System.out.println( "The wind speed is 96-110 mph! ");
            }
        else {
            if (category == 3) {
                System.out.println( "The wind speed is 111-130 mph! ");
            }
           else {
                if (category == 4) {
                    System.out.println( "The wind speed is 131-155 mph!" );
                }
            else { 
                if (category == 5) {
                    System.out.println( "The wind speed is over 155 mph!!" );
                }
            }
        }
    }
}

}
}
