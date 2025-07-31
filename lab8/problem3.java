import java.util.Scanner;
public class problem3 {

    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.print( "Enter a positive integer: ");
    int n = input.nextInt();
    while (n <= 0) {
        System.out.print( "Invalid input! \n Enter a positive integer: ");
        n = input.nextInt();
    }
    int count = 0;
    for (int i = 1; i <= n; i++) {
        System.out.print( "Now enter " + n + " more integers: " );
        int entry = input.nextInt();
        if (entry % 2 ==1) {
            count++;
            
            }
        }
    System.out.println(count + " were odd");
    }
}