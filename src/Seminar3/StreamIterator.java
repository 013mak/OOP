package Seminar3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter = 0;
    private final List<StudentGroup> streamList;

    public StreamIterator(Stream stream) {
        this.counter = 0;
        this.streamList = stream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return counter<streamList.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) return null;
        counter++;
        return streamList.get(counter);
    }

    @Override
    public void remove() {
        streamList.remove(counter);
    }
}
