
/**
 * Creates a queue and tests the methods within the MyQueue Class
 *
 * @author Joshua Zhang
 * @version 9/29/23
 */
import java.io.*;
import java.util.*;
public class testQueue
{
    private MyQueue testQueue;

    /**
     * Constructs a new queue
     */
    public testQueue()
    {
        testQueue = new MyQueue();
    }

    /**
     * Tests the methods in the MyQueue Class
     *
     */
    public void testCase()
    {   
    System.out.println(testQueue.isEmpty());
    testQueue.enqueue(7);
    testQueue.enqueue(8);
    System.out.println(testQueue.toString());
    System.out.println(testQueue.isEmpty());
    System.out.println(testQueue.isFull());
    testQueue.enqueue(9);
    testQueue.enqueue(10);
    System.out.println(testQueue.isEmpty());
    System.out.println(testQueue.isFull());
    System.out.println(testQueue.front());
    System.out.println(testQueue.dequeue());
    testQueue.dequeue();
    testQueue.dequeue();
    testQueue.enqueue(11);
    System.out.println(testQueue.isEmpty());
    System.out.println(testQueue.isFull());
    System.out.println(testQueue.front());
    testQueue.dequeue();
    testQueue.dequeue();
    testQueue.enqueue(12);
    testQueue.enqueue(13);
    testQueue.enqueue(14);
    testQueue.dequeue();
    testQueue.dequeue();
    System.out.println(testQueue.toString());
    System.out.println(testQueue.isEmpty());
    System.out.println(testQueue.isFull());
    System.out.println(testQueue.front());
    }
}
