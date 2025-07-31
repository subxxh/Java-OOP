import java.util.Scanner;
public class problem5 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

        System.out.print( "Enter value for n: ");
        int n = input.nextInt();

        while(n < 0 || n % 2 != 1) {
            System.out.print( "Enter value for n: ");
            n = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { System.out.print("X");
                } else if (i== 0 || i == n - 1) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}