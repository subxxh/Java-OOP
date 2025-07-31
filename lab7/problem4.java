import java.util.Scanner;
public class problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (true){
            System.out.print( "Enter a numeric grade: " );
            int x = input.nextInt();

            if (x < 0) { break; }
            count++;
            sum = sum + x;
        }
        double avg = sum / count;
        System.out.print( "The average grade is " + avg);
    }
}