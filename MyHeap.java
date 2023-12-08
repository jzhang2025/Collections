
/**
 * Write a description of class MyHeap here.
 *
 * @author (your name)
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
        
    }
}
