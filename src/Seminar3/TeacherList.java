package Seminar3;

import java.util.List;

public class TeacherList {

    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }
    public void editTeacher(Long teacherID, String firstName, String lastName, String middleName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherID)) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
            }
        }
    }
}
