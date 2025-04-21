package BLC_Problem;

public class Course {
    protected String courseId;
    protected String courseTitle;
    protected int creditHours;

    public Course(String courseId, String courseTitle, int creditHours) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
