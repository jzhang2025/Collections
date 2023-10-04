
/**
 * Write a description of class MyStackLL here.
 *
 * @author Joshua Zhang 
 * @version (a version number or a date)
 */
public class MyStackLL<E>
{
    private MyLinkedList<E> stack;
    private Node<E> head;
    private int size;
    /**
     * Constructor for objects of class MyStackLL
     */
    public MyStackLL()
    {
        head = null;
        MyLinkedList<E> stack = new MyLinkedList<E>();
        size = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void push(E element) {
        stack.addHead(element);
        size++;
    }
    
    public E pop() {
        size--;
        return stack.removeHead(); 
    }
    
    public E top() {
        return stack.getHead();
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public String toString() {
        String listString = "";
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            listString += temp.getData();
            temp = temp.getNext();
            if (i < size - 1) { //not if last element
                listString += ", ";
            }
        }
        return listString;
    }
}
