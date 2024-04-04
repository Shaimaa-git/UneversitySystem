import java.util.List;
import java.util.Objects;

public class Student {
    String studentName;
    Integer id;
    String major;
    String level;
    List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(major, student.major) && Objects.equals(level, student.level) && Objects.equals(teacherList, student.teacherList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, major, level, teacherList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                ", level='" + level + '\'' +
                ", teacherList=" + teacherList +
                '}';
    }
}
