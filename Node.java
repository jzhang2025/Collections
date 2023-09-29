
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    private int data;
    private Node next;

    /**
     * Constructor for objects of class Node
     */
    public Node(int element)
    {
        data = element;        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public int getData()
    {
        return data;
    }

    public void setData(int y)
    {
        data = y;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node y)
    {
        next = y; 
    }
}
