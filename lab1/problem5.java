import java.util.Scanner;
public class problem5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( " How many 3-pointers? ");
        int threePointers = input.nextInt();

        System.out.print( " How many 2-pointers? ");
        int twoPointers = input.nextInt();

        int total = (3 * threePointers) + (2 * twoPointers);
        System.out.println( " The total points scored are: " + total);

        input.close();
    }
}