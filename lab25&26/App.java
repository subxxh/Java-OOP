import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<Integer, Student> treemap = new TreeMap<>();

        try {
            File file = new File("students.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] values = s.split(",");

                int id = Integer.parseInt(values[0]);
                String firstName = values[1];
                String lastName = values[2];
                double gpa = Double.parseDouble(values[3]);

                Student student = new Student(id, firstName, lastName, gpa);
                student.setId(id);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setGpa(gpa);
                treemap.put(id, student);

            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("not found ");
        }

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print all students");
            System.out.println("2. Add a new student");
            System.out.println("3. Delete an existing student");
            System.out.println("4. Find an existing student");
            System.out.println("5. Exit");

            System.out.println("Enter your choice between 1 - 5");
            int i;
            try {
                i = scan.nextInt();
                if (i < 5 && i > 1) {
                    System.out.println("Number entered " + i);
                } 
            } catch (InputMismatchException e) {
                System.out.println(" Invalid number ");
                scan.nextLine();
                continue;
            }

            if (i == 5) {
                try (PrintWriter writer = new PrintWriter(new FileOutputStream("students.txt"))) {
                    for (var student : treemap.values()) {
                        writer.println(student.getId() + "," + student.getFirstName() + "," + student.getLastName()
                                + "," + student.getGpa());
                    }
                } catch (Exception e) {
                    System.out.println("Error saving students to file.");
                }
                System.out.println("Exiting the application. Goodbye!");
                System.exit(0);
            }

            if (i == 1) {
                System.out.println(treemap.size() + " students as follows...");
                System.out.println("+-------+-------------+--------------+------+");
                System.out.println("| ID    | First Name  |  Last Name   |  Gpa |");
                System.out.println("+-------+-------------+--------------+------+");
                for (var student : treemap.values()) {
                    System.out.println(student);
                }
                System.out.println("+-------+-------------+--------------+------+");
                continue;
            }

            int ID = 0;
            String name1, name = null;
            if(i == 2){
                while(true){
                try{
                System.out.print("Enter student id [1-99]: ");
                Scanner id = new Scanner(System.in);
                ID = id.nextInt();
                if(treemap.containsKey(ID)){
                  System.out.println(" ---> A student with id = " + ID + " already exists!");
                  continue;
                }
                if(ID > 99 || ID < 1){
                  System.out.println("  --> id must be >= 1 && <= 99!");
                  continue;
                }
                
              }
              catch(Exception e){
                System.out.println("  --->  id must be an integer!"); 
                continue;
              }
              break;
              }
              
              while(true){
              System.out.print("Enter first name: ");
              Scanner n = new Scanner(System.in);
              String n1 = n.nextLine();
              name1 = n1.trim();
              if(name1.length() < 2 || name1 == null){
                System.out.println("Firstname must have at least 2 characters");
                continue;
              }
              break;
            }
              while(true){
              System.out.print("Enter last name: ");
              Scanner n = new Scanner(System.in);
              String n1 = n.nextLine();
              name = n1.trim();
              if(name.length() < 2 || name == null){
                System.out.println(" LastName must have at least 2 characters");
                continue;
              }
              break;
            }
            double d = 0;
            while(true){
              try{
            System.out.print("Enter student gpa [0.0 - 4.0]: ");
            Scanner n = new Scanner(System.in);
            d = n.nextDouble();
            if(d > 4.0 || d < 0){
             System.out.println("  gpa must be >= >= 0.0 && <= 4.0!");
             continue;
            }
          }
          catch(Exception e){
            System.out.println("gpa must be a number");
            continue;
          }
            break;
          }
            System.out.println("Added 1 student....");
            System.out.println("+----+---------------------+---------------------+------+");
            System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
            System.out.println("+----+---------------------+---------------------+------+");
            // add a line here for formatting
            System.out.print(String.format("|%3d | %19s | %19s | %3.2f |\n", ID, name1, name, d));
            System.out.println("+----+---------------------+---------------------+------+");
            Student newstudent = new Student(ID, name1, name, d);
            treemap.put(ID, newstudent);
            continue;
            }
        
        
            if (i == 3) {
                int y;
                Scanner remove = new Scanner(System.in);
                try {
                    System.out.println("Enter an id to remove");
                    y = remove.nextInt();
                    System.out.println("Removing......");
                    System.out.println(treemap.get(y));
            
                    if (treemap.containsKey(y)) {
                        treemap.remove(y);
                    } else {
                        System.out.println(" id must be an integer ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer for the id.");
                } 
            }

            if(i == 4){
                int ohmy = 0;
                while(true){
                  try{
                    System.out.print("Enter student id [1-99]: ");
                    Scanner i4 = new Scanner(System.in);
                    ohmy = i4.nextInt();
                    if(ohmy > 99 | ohmy < 1){
                      System.out.println("  --> id must be >= 1 && <= 99!");
                      continue;
                    }
                    break;
                  }
                  catch(Exception e){
                    System.out.println("  --->  id must be an integer: ");
                    continue;
                  }
                }
                  if(treemap.containsKey(ohmy)){
                  System.out.println("Student with id: " + ohmy + " found:");
                  Student found = treemap.get(ohmy);
                  System.out.println("+----+---------------------+---------------------+------+");
                  System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
                  System.out.println("+----+---------------------+---------------------+------+");
                  System.out.print(String.format("|%3d | %19s | %19s | %3.2f |\n", found.getId(), found.getFirstName(), found.getLastName(), found.getGpa()));
                  System.out.println("+----+---------------------+---------------------+------+");
                  continue;
                }
                else{
                  System.out.println("User does not exist.");
                  continue;
        }
    }
}
}
}
