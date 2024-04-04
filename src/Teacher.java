import java.util.Objects;

public class Teacher {
    Integer id;
    String teacherName;
    String subjectName;
    Room rooms;
    Department department;
    College college;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherName, teacher.teacherName) && Objects.equals(subjectName, teacher.subjectName) && Objects.equals(rooms, teacher.rooms) && Objects.equals(department, teacher.department) && Objects.equals(college, teacher.college);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherName, subjectName, rooms, department, college);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", rooms=" + rooms +
                ", department=" + department +
                ", college=" + college +
                '}';
    }
}
