package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherView teacherView = new TeacherView();
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
        }

    public void editTeacher(Long teacherId, String firstName, String middleName, String lastName) {
        teacherService.editTeacher(teacherId, firstName, middleName, lastName);
        ;
    }
    public void  viewTeacher(TeacherList teacherList) {
        teacherView.sendOnConsole(teacherList.getTeacherList());
    }

}
