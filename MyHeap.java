import java.util.Arrays;
/**
 * Creates a min heap data structure 
 *
 * @author Joshua Zhang 
 * @version (a version number or a date)
 */

public class MyHeap <E extends Comparable<E>>
{
    private E[] elemArray;
    private int lastNode;

    /**
     * Constructor for objects of class MyHeap
     */
    public MyHeap()
    {
        elemArray = (E[]) new Comparable[16];
        lastNode = -1;
    }

    public void add(E element)
    {
        lastNode++;
        elemArray[lastNode] = element;
        if (lastNode == 0) {
            return;
        } else {
            int child = lastNode;
            int parent = (child-1)/2;
            elemArray[lastNode] = element;
            while (child != 0 && (element.compareTo(elemArray[parent]) < 0)) {
                E temp = elemArray[parent];
                elemArray[parent] = element;
                elemArray[child] = temp;
                child = parent;
                parent = (child - 1)/2;
            }
        }
    }
            
    public E getMin() {
        return elemArray[0];
    }
    
    public boolean isEmpty() {
        return (lastNode == -1);
    }
    
    public int size() {
        return (lastNode += 1);
    }
    
    public String toString() {
        return Arrays.toString(elemArray);
    }
}
