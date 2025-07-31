import java.util.Scanner;
public class problem4 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 28; i < 388; i++) {
        System.out.print(i + " " );
        if ( i % 10 == 7 ){
        System.out.println();
      }
    }
  }
}