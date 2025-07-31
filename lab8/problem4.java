import java.util.Scanner;
public class problem4 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a large integer n: " );
        int n = input.nextInt();
        for(int i = 1; i <= 4; i++) {
            System.out.print( "Type a smaller value of n: ");
            int tmp = input.nextInt();
            if (n > tmp) {
                n = tmp;
            } else {
                System.out.println( "Goodbye." );
                break;
            }    
        }
    }
}