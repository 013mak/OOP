package Seminar3;

public class TeacherService {

    private TeacherList teacherList;


    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.createTeacher(firstName, lastName, middleName);
    }
    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherList.editTeacher(teacherId, firstName, lastName, middleName);
    }


}
