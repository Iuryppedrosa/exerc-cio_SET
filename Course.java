package problema6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Course {
    private Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getStudentCount() {
        return students.size();
    }

    public Set<Student> getStudents() {
        return students;
    }
}
