import java.util.Objects;

public class Subject {
     Integer id;
     String subjectName;
     Department subjectDepartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Department getSubjectDepartment() {
        return subjectDepartment;
    }

    public void setSubjectDepartment(Department subjectDepartment) {
        this.subjectDepartment = subjectDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName) && Objects.equals(subjectDepartment, subject.subjectDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, subjectDepartment);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectDepartment=" + subjectDepartment +
                '}';
    }
}
