package GUI;

public class grade {

    protected int gradeLvl;
    protected double GPA;
    protected int numCourses;
    
    public grade () {
        GPA = 0;
    }
    
    public grade (int gradeLvl, int numCourses) {
        this.gradeLvl = gradeLvl;
        this.numCourses = numCourses;
    }
   
    public grade (int gradeLvl, double GPA, int numCourses) {
        this.gradeLvl = gradeLvl;
        this.GPA = GPA;
        this.numCourses = numCourses;
    }
    
    public void setGradeLvl (int gradeLvl) {
        this.gradeLvl = gradeLvl;
    }
    
    public void calculateGPA (courses course []) {
        double GPA = 0;
        for (int i = 0; i < numCourses; i++) {
            GPA += course[i].getCourseGrade();
        }
        this.GPA = GPA/numCourses;
    }
    
    public double getGPA () {
        return this.GPA;
    }
    
    public String [] getAllCourseName (courses course []) {
        String courseNames [] = new String [numCourses];
        for (int i = 0; i < numCourses; i++) {
            courseNames [i] = course[i].getCourseName();
        }
        return courseNames;
    }
    
}