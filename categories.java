package GUI;

public class categories extends courses {
    
    protected String categoryName;
    protected double categoryGrade;
    
    public categories () {
        categoryName = "";
    }
    
    public categories (int gradeLvl, int numCourse, String courseName, double courseGrade,
            String categoryName, double categoryGrade) {
        super(gradeLvl, numCourse, courseName, courseGrade);
        this.categoryName = categoryName;
        this.categoryGrade = categoryGrade;
    }
    
    public void setCategoryName (String categoryName) {
        this.categoryName = categoryName;
    }
    
    public void setCategoryGrade (double categoryGrade) {
        this.categoryGrade = categoryGrade;
    }
    
    public String getCategoryName () {
        return categoryName;
    }
    
    public double getCategoryGrade () {
        return categoryGrade;
    }
    
}