package CourseRegistrationSystem;

public class Main{
	public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();

        // 학생 추가
        Student student1 = new Student("홍길동", "20241001");
        Student student2 = new Student("김철수", "20241002");
        system.addStudent(student1);
        system.addStudent(student2);

        // 강의 추가
        Course course1 = new Course("프로그래밍 원리", "G03771-01");
        Course course2 = new Course("객체지향 프로그래밍", "G03772-01");
        system.addCourse(course1);
        system.addCourse(course2);

        // 수강 신청
        system.registerCourse("20241001", "G03771-01");
        system.registerCourse("20241001", "G03772-01");
        system.registerCourse("20241002", "G03771-01");

        // 학생의 수강 내역 출력
        system.printStudentCourses("20241001");
        system.printStudentCourses("20241002");
    }
}