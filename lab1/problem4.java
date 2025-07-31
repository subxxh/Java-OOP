import java.util.Scanner;
public class problem4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter your name : ");
        String name = input.next();

        System.out.print(" Enter your height in inches: ");
        int height = input.nextInt();
        
        System.out.println( " Hi " + name + ". You're " + (height * 2.54) + " centimeters tall!");

        input.close();
    }
}
