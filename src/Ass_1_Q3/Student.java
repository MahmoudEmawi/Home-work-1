
package Ass_1_Q3;

/**
 *
 * @author Mahmoud Emawi
 */
public abstract class Student {

    private int id;
    private String name;
    private String major;
    private double grade;

    public Student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }
    public Student() {
       super();
   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
      @Override
   public String toString() {
       return "Student [id=" + this.id + ", name=" + this.name + ", major=" + this.major
               + ", grade=" + this.grade + "]";
   }
}
