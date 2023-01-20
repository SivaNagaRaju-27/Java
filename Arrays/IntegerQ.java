package Arrays;

import exceptionHandling.QueueEmptyException;
import exceptionHandling.QueueFullException;

public interface IntegerQ {
    void put(int x) throws QueueFullException;
    int get() throws QueueEmptyException;
}
