import java.util.Scanner;
public class problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a value for n: ");
        int n = input.nextInt();

        if (n % 2 == 0 || n <= 0) {
            System.out.println("Invalid input! Please enter an odd positive integer.");
            System.exit(0);
        }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        if (i == n / 2) {
                            System.out.print("*");
                        } else if ( j < n / 2) {
                            System.out.print("+");
                        } else {
                            System.out.print("x");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
         
        }
    }