package GUI;

public class assignments extends categories {
    
    protected String assignmentName;
    protected double assignmentGrade;
    protected String dateAssigned;
    protected String dateDue;
    
    public assignments () {
        this.assignmentName = "";
    }
    
    public assignments (int gradeLvl, int numCourse, String courseName, double courseGrade,
            String categoryName, double categoryGrade, String assignmentName, double assignmentGrade,
            String dateAssigned, String dateDue) {
        super(gradeLvl, numCourse, courseName, courseGrade, categoryName, categoryGrade);
        this.assignmentName = assignmentName;
        this.assignmentGrade = assignmentGrade;
        this.dateAssigned = dateAssigned;
        this.dateDue = dateDue;
    }
    
    public void setAssignmentName (String assignmentName) {
        this.assignmentName = assignmentName;
    }
    
    public void setAssignmentGrade (double assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }
    
    public void setDateAssigned (String dateAssigned) {
        this.dateAssigned = dateAssigned;
    }
    
    public void setDateDue (String dateDue) {
        this.dateDue = dateDue;
    }
    
    public String getAssignmentName () {
        return assignmentName;
    }
    
    public double getAssignmentGrade () {
        return assignmentGrade;
    }
    
    public String getDateAssigned () {
        return dateAssigned;
    }
    
    public String getDateDue () {
        return dateDue;
    }

}