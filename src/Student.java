package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
    private String studentId;
    private List<Course> enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "학생 이름: " + name + ", 학번: " + studentId;
    }
}