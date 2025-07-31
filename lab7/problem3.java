import java.util.Scanner;
public class problem3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print( "Enter a number greater than 100: " );
    int number = input.nextInt();
    while (number <= 100) {
        System.out.println("Invalid input!");
        System.out.print( "Enter a number greater than 100: ");
        number = input.nextInt();
    }   
    for (int i = 1; i * i < number; i++) {
        System.out.println( i + "\t\t" + i * i);
    }
    }
}