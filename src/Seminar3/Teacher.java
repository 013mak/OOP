package Seminar3;

public class Teacher extends User{

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    private Long teacherId;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
