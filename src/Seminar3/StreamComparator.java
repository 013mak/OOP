package Seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {


    @Override
//    public int compare(Stream o1, Stream o2) {
//        return o1.compareTo(o2);
//    }

    public int compare(Stream o1, Stream o2) {
        int resultOfCompare = o1.getStudentGroupList().size() - o2.getStudentGroupList().size();
        return resultOfCompare;
    }
}