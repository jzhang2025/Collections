
/**
 * Write a description of class MyQueue here.
 *
 * @author Joshua Zhang 
 * @version 9/27/23
 */
public class MyQueue
{
        
    // instance variables - replace the example below with your own
    private int[] queue;
    private int back;
    private int front;
    private int size;

    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue(int length)
    {
        queue = new int[length];
        size = 0;
        back = 0;
        front = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enqueue(int element)
    {
        queue[back] = element;
        back++;
        size++;
    }
    
    public int dequeue()
    {
        front++;
        size--;
        return queue[front];
    }
    
    public boolean isEmpty()
    {
       return (size == 0);
    }
    public int front()
    {
       return queue[front];
    }
    public int size()
    {
        return size;
    }
    public boolean isFull()
    {
        return (size() >= queue.length);
    }
    public String toString()
    {
        return "";
    }
}
