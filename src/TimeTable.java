import java.util.Objects;

public class TimeTable {
    Integer id;
    String time;
    Subject subject;
    Teacher teacher;
    Room room;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeTable timeTable = (TimeTable) o;
        return Objects.equals(time, timeTable.time) && Objects.equals(subject, timeTable.subject) && Objects.equals(teacher, timeTable.teacher) && Objects.equals(room, timeTable.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, subject, teacher, room);
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "time='" + time + '\'' +
                ", subject=" + subject +
                ", teacher=" + teacher +
                ", room=" + room +
                '}';
    }
}
