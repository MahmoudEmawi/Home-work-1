/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass_1_Q3;

/**
 *
 * @author Mahmoud Emawi
 */
public class ArtStudent extends Student {
    
     double midMarks, reportMarks, finalMarks;

    public ArtStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
    }
    public ArtStudent() {
        super();
    }
    double calGrade(double midMarks, double reportMarks, double finalMarks) {
        double grade = midMarks + reportMarks + finalMarks;
        return grade;
    }
    
}
