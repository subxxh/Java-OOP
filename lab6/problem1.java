import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double salary = 0.01;
    int day = 1;

    System.out.println("Day \t Salary:");
    while(salary < 10001) {
    System.out.println(day + "\t$" + salary);
    salary *= 2.0;
    day++;
        }
    }
}