import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter a numeric score: " );
        int score = input.nextInt();

    if (score >= 90) {
        System.out.println( "A" );
    } 
    else if (score >=80 && score <= 89) {
        System.out.println( "B" );
    } 
    else if (score >=70 && score <= 79) {
        System.out.println( "C" );
    }
    else if (score >=60 && score <= 69) {
        System.out.println( "D" );
    } else {
        System.out.println("F" );
    }

    }
}