import java.util.NoSuchElementException;

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
    public MyLinkedList(){
        head = null; 
        size = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addHead(int element){
        Node newNode = new Node(element); 
        if (head == null){
            head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    public int removeHead() throws NoSuchElementException{
        if (head == null) {
            throw new NoSuchElementException();
        }else{
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
            return temp.getData();
        }
    }
    
    public int getHead(){
        return head.getData(); 
    }
    
    public int size(){
        return size; 
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void addTail(int element){
        Node newNode = new Node(element);
        Node temp = head;
        if (head == null){
            head = newNode;
        }else{
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            size++;
        }
        
    }
    
    public String toString() {
        String listString = "";
        Node temp = head;
        for (int i = 0 ; i < size; i++) {
            listString += temp.getData();
            temp = temp.getNext();
            if (i < size - 1) {
                listString += ", ";
            }
        }
        return listString;
    }
}
