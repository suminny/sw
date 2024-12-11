package CourseRegistrationSystem;

public class Course {
	private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return "강의명: " + courseName + ", 강의코드: " + courseCode;
    }
}