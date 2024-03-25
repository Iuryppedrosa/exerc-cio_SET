package problema6;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
    private Set<Course> courses = new HashSet<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getTotalStudents(){
        Set<Student> uniqueStudent = new HashSet<>();

        for (Course course : courses) {
            uniqueStudent.addAll(course.getStudents());
        }

        return uniqueStudent.size();
    }
}
