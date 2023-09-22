
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
       
    }
    
    public int dequeue()
    {
       return 0;
    }
    
    public boolean isEmpty()
    {
       if(size == 0){
           return true;
       }else{
           return false;
       }
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
        if(size() >= queue.length){
            return true;
        }else{
            return false;
        }
    }
    public String toString()
    {
        return "";
    }
}
