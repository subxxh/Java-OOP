import java.util.Scanner;
public class problem3 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a + b >= 100);

    }
}