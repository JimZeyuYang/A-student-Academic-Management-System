package GUI;

public class courses extends grade {
    
    protected String courseName;
    protected double courseGrade;
    
    
    public courses () {
        courseName = "";
    }
    
    public courses (int gradeLvl, int numCourse, String courseName, double courseGrade) {
        super(gradeLvl, numCourse);
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }
    
    public void setCourseName (String courseName) {
        this.courseName = courseName;
    }
    
    public void setCourseGrade (double courseGrade) {
        this.courseGrade = courseGrade;
    }
    
    public String getCourseName () {
        return courseName;
    }
    
    public double getCourseGrade () {
        return courseGrade;
    }
    
    
    
    
}
