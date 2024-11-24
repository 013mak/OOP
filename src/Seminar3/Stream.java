package Seminar3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {

    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {
        return this.studentGroupList.size() - o.studentGroupList.size();
    }
}
