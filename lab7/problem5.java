import java.util.Scanner;
public class problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter a number between 10 and 20: ");
        int i = input.nextInt();

        if (i > 10 && i < 20) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) 
                    System.out.print("^");
                 else
                    System.out.print("*");
                
            }
        }
    }
}