package Ass_1_Q3;

import java.util.*;
import java.io.*;

/**
 *
 * @author Mahmoud Emawi
 */

public class ass1_Q3 {

    public static void main(String[] args) throws IOException{
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of student");
        int size = input.nextInt();
        Student[] studentList = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the id");
            int id = input.nextInt();
            System.out.println("Enter the name");
            String name = input.next();
            System.out.println("Enter major");
            String major = input.next();
            System.out.println("1.It Student\n"
                    + "2.Art Student");
            int key = input.nextInt();
            if (key == 1) {
                System.out.println("Enter mid masrk");
                double midMarks = input.nextDouble();
                System.out.println("Enter project mark");
                double projectMarks = input.nextDouble();
                System.out.println("Enter final mark");
                double finalMarks = input.nextDouble();
                ItStudent itStudent = new ItStudent();
                double grade = itStudent.calGrade(midMarks, projectMarks, finalMarks);
                Student student = new ItStudent(id, name, major, grade);
                studentList[i] = student;

            } else {
                System.out.println("Enter mid masrk");
                double midMarks = input.nextDouble();
                System.out.println("Enter report masrk");
                double reportMarks = input.nextDouble();
                System.out.println("Enter fnal masrk");
                double finalMarks = input.nextDouble();
                ArtStudent artStudent = new ArtStudent();
                double grade = artStudent.calGrade(midMarks, reportMarks, finalMarks);
                Student student = new ArtStudent(id, name, major, grade);
                studentList[i] = student;

            }

        }

        Arrays.sort(studentList, (a, b) -> Double.compare(b.getGrade(), a.getGrade()));
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("output.txt"));
        for (int i = 0; i < studentList.length; i++) {
            outputWriter.write(studentList[i].toString());
            outputWriter.newLine();
            System.out.println(studentList[i].toString());
        }
        outputWriter.flush();
        outputWriter.close();
    }

}


