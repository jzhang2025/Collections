import java.util.Arrays;
/**
 * Creates a min heap data structure 
 *
 * @author Joshua Zhang 
 * @version (a version number or a date)
 */

public class MyHeap <E extends Comparable<E>>
{
    // instance variables - replace the example below with your own
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(E element)
    {
        lastNode++;
        elemArray[lastNode] = element;
        if (lastNode == 0) {
            return;
        } else {
            int child = lastNode;
            int parent = (child-1)/2;
            while (child != 0 && elemArray[child].compareTo(elemArray[parent])) {
                
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
