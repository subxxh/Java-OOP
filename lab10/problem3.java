import java.util.Scanner;
public class problem3 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a positive integer: ");
        int n = input.nextInt();
        int count = 0;
        if(n < 1) 
            System.exit(0);
        for(int i = 1; i <= n; i++) {
            int roll = (int) (Math.random() * 6 + 1);
            if (roll == 1) { 
                count++;
            }
            System.out.println("Roll " + i + ": " + roll);
        }
            System.out.println( "Total number of ones rolled: " + count);
        
    }
}