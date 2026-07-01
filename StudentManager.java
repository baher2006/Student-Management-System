import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class StudentManager {
   private ArrayList<Student> students = new ArrayList<>();
   public void addStudent(Student newStudent){
       for(Student student: students) {
           if (student.getId() == newStudent.getId()) {
               System.out.println("Student already exists with id " + newStudent.getId());
               return;
           }
       }
       students.add(newStudent);
   }
   public void displayAllStudents(){
       if(students.isEmpty()){
           System.out.println("Nothing to Display");
           return;
       }
       for(Student student: students){
           System.out.println(student);
       }
   }
   public void searchStudent(int id){
       for(Student student: students){
           if(student.getId() == id){
               System.out.println(student);
               return;
           }
       }
       System.out.println("Student not found");
   }
   public void deleteStudent(int id){
       for(Student student: students){
           if(student.getId() == id){
               students.remove(student);
               System.out.println("student deleted: " + student);
               return;
           }
       }
       System.out.println("Student not found");
   }
   public void  updateStudent(int id,String name,int age, int year, String spec){
       for(Student student: students){
           if(student.getId() == id){
               student.setName(name);
               student.setAge(age);
               student.setYear(year);
               student.setSpecialization(spec);
               System.out.println(" Student updated successfully ");
               return;
           }
       }
       System.out.println("Student not found");
   }
   public void saveToFile(){
       try{
           FileWriter writer = new FileWriter("students.txt");
           for(Student student: students){
               writer.write(student.getId()+","+student.getName()+","+student.getAge()+","+student.getYear()+","+student.getSpecialization()+"\n");
           }
           writer.close();
           System.out.println("Student saved successfully");
       } catch (IOException e){
           System.out.println("Error while saving student file");

       }
   }
    public void loadFromFile(){
        try {
            File file = new File("students.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int year = Integer.parseInt(data[3]);
                String spec = data[4];

                Student student = new Student(id, age, year, name, spec);
                students.add(student);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}

