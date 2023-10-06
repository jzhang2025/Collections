
/**
 * Write a description of class MyQueueLLTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueueLLTest
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        MyQueueLL testQueue = new MyQueueLL();
        testQueue.enqueue(4);
        testQueue.enqueue(5);
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.front());
        System.out.println(testQueue.isEmpty());
        testQueue.enqueue(2);
        testQueue.enqueue(1);
        testQueue.enqueue(5);
        System.out.println(testQueue.toString());
        
    }
    
    public static MyQueueLL<Integer> reverseQueue(MyQueueLL<Integer> originalQueue) {
        MyQueueLL<Integer> reversedQueue = new MyQueueLL<>();

        while (!originalQueue.isEmpty()) {
            Integer element = originalQueue.dequeue();
            reversedQueue.enqueue(element);
        }

        return reversedQueue;
    }


}
