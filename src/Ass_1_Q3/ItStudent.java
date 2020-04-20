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
public class ItStudent extends Student{
    
    double midMarks, projectMarks, finalMarks;

    public ItStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
    }
    public ItStudent() {
        super();
    }
    double calGrade(double midMarks, double projectMarks, double finalMarks) {
        double grade = midMarks + projectMarks + finalMarks;
        return grade;
    }
}
