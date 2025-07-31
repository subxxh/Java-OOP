import java.util.Scanner;
    public class problem3 {
        public static void main(String [] args) {

            Scanner input = new Scanner(System.in);

            System.out.print( " Please enter a four digit integer: ");
            int number = input.nextInt();

            int firstdigit = number % 10;
            int seconddigit = (number / 10) % 10;
            int thirddigit = (number / 100) % 10;
            int fourthdigit = (number / 1000) % 10;

            System.out.println( " Your number in reverse is: " + firstdigit + seconddigit + thirddigit + fourthdigit);
            
            input.close();


        }
    }