package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup> getSortedStudentGroupBySize() {
        List<StudentGroup> streamList = new ArrayList<>(stream.getStudentGroupList());
        Collections.sort(streamList);
        return streamList;
    }

}
