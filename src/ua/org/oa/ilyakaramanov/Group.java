package ua.org.oa.ilyakaramanov;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {


    private ArrayList<Student> students;

    public Group() {
        students = new ArrayList<>(100);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + students +
                '}';
    }


}
