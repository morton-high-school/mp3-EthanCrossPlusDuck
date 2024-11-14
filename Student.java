public class Student{
    private String name;
    private int id;
    private double gpa = 0.0;
    private int grades = 0;
    private Teacher favTeacher = null;
    private static int count = 0;
    

    public Student(String name){
        this.name = name;
        this.id = count++;
    }

    public static void addStudents(int students){
        count += students;
    }

    public static int getStudentCount(){
        return count;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public void addGrade(int grade){
        gpa = (gpa * grades + grade) / ++grades;
    }

    public double getGPA(){
        return gpa;
    }

    public void setFavoriteTeacher(Teacher favorite){
        this.favTeacher = new Teacher(favorite.getName(), favorite.getReason());
    }

    public Teacher getFavoriteTeacher(){
        return this.favTeacher;
    }
}