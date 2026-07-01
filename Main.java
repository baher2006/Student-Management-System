//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        manager.loadFromFile();
        while (true) {
            System.out.println(" ==== Student System ==== ");
            System.out.println(" 1- Add Student ");
            System.out.println(" 2- Display Students ");
            System.out.println(" 3- Search Student ");
            System.out.println(" 4- Delete Student ");
            System.out.println(" 5- Update Student ");
            System.out.println(" 6- Save Data ");
            System.out.println(" 7- Exit ");
            System.out.println(" Enter Choice: ");

            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter Student id: ");
                int id = input.nextInt();
                System.out.print("Enter Student age: ");
                int age = input.nextInt();
                System.out.print("Enter Student year: ");
                int year = input.nextInt();
                input.nextLine();
                System.out.print("Enter Student name: ");
                String name = input.nextLine();
                System.out.print("Enter Student specialization: ");
                String specialization = input.nextLine();
                Student s = new Student(id, age, year, name, specialization);
                manager.addStudent(s);
            }
            else if (choice == 2) {
                manager.displayAllStudents();
            } else if (choice == 3) {
                System.out.print("Enter Student id: ");
                int id = input.nextInt();
                manager.searchStudent(id);
            } else if (choice == 4) {
                System.out.print("Enter Student id: ");
                int id = input.nextInt();
                manager.deleteStudent(id);
            } else if (choice == 5) {
                System.out.println("Enter Student id: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Enter new Student name: ");
                String name = input.nextLine();
                System.out.println("Enter new Student age: ");
                int age = input.nextInt();
                System.out.println("Enter new Student year: ");
                int year = input.nextInt();
                input.nextLine();
                System.out.println("Enter new Student specialization: ");
                String specialization = input.nextLine();
                manager.updateStudent(id, name, age, year, specialization);
            } else if (choice == 6) {
                manager.saveToFile();
            }
            else if (choice == 7) {
                System.out.print(" Goodbye ");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        input.close();
    }
}