package Seminar3;


import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;

    }

    public List<Student> getSortedByFIOStudentList() {
        List<Student> studentList = studentGroupService.getSortedByFIOStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    public List<StudentGroup> getSortedStudentGroupBySize() {
        return streamService.getSortedStudentGroupBySize();
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
