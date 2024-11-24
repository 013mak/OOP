package Seminar3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfCompare = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfCompare == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        else return resultOfCompare;
    }
}
