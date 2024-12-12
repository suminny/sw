package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recommend2 {
	static class Course {
        String name;
        int credit;

        Course(String name, int credit) {
            this.name = name;
            this.credit = credit;
        }

        @Override
        public String toString() {
            return name + " (" + credit + "학점)";
        }
    }

    public static void main(String[] args) {
        // 교양 과목 목록 생성
        List<Course> generalCourses = new ArrayList<>();
        generalCourses.add(new Course("철학의 이해", 2));
        generalCourses.add(new Course("한국 경제의 이해", 2));
        generalCourses.add(new Course("인간 발달", 2));
        generalCourses.add(new Course("진로 탐색과 목표 설정", 2));
        generalCourses.add(new Course("스포츠 관광", 1));

        // 사용자 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("남은 학점을 입력하세요: ");
        int remainingCredits = scanner.nextInt();

        // 추천 과목 출력
        System.out.println("추천 과목:");
        boolean hasRecommendation = false;
        for (Course course : generalCourses) {
            if (course.credit <= remainingCredits) {
                System.out.println(course);
                hasRecommendation = true;
            }
        }

        if (!hasRecommendation) {
            System.out.println("남은 학점으로 수강할 수 있는 과목이 없습니다.");
        }

        scanner.close();
    }
}
