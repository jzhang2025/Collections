
/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList
{
    private Node head; 
    private int size;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList()
    {
        head = null; 
        size = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addHead(int element)
    {
        Node newNode = new Node(element); 
        if (head == null){
            head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    public void removeHead()
    {
        if (head.getNext() == null){
            head = null;
        }else{
            head.getNext() = head;
        }
    }
}
