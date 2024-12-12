package CourseRegistrationSystem;

import java.util.HashMap;
import java.util.Map;

public class CourseRegistrationSystem{
	private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();

    // 학생 추가
    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    // 강의 추가
    public void addCourse(Course course) {
        courses.put(course.getCourseCode(), course);
    }

    // 수강 신청
    public void registerCourse(String studentId, String courseCode) {
        Student student = students.get(studentId);
        Course course = courses.get(courseCode);

        if (student == null) {
            System.out.println("학번 " + studentId + "에 해당하는 학생이 없습니다.");
            return;
        }

        if (course == null) {
            System.out.println("강의 코드 " + courseCode + "에 해당하는 강의가 없습니다.");
            return;
        }

        student.enrollCourse(course);
        System.out.println("학생 " + studentId + "이(가) 강의 " + courseCode + "를 수강 신청했습니다.");
    }

    // 학생의 수강 내역 출력
    public void printStudentCourses(String studentId) {
        Student student = students.get(studentId);

        if (student == null) {
            System.out.println("학번 " + studentId + "에 해당하는 학생이 없습니다.");
            return;
        }

        System.out.println("학생 " + studentId + "의 수강 내역:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course);
        }
    }
}