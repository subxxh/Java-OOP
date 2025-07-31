import java.util.Scanner;
public class problem4 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int random = (int)(Math.random() * 100 + 1);
    int guess = 0; 

    System.out.print( "Guess the integer I picked from the range 1 to 100 ");
    int x = input.nextInt();

    while ( x != random) {
    if (x > random) {
        System.out.println( "Too big. Guess again. ");
        x = input.nextInt();
        guess++;
    } else if (x < random){
        System.out.println( "Too small. Guess again. ");
        x = input.nextInt();
        guess++;
    }
    }
    if (x == random) {
    System.out.print( "Congratulations! You took " + guess + " guesses.");
    }


    }
}

//this was rlly fun lol