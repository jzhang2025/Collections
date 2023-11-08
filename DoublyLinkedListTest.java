
import java.util.*;
/**
 * Write a description of class DoublyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoublyLinkedListTest
{
  
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        MyLinkedList list = new MyLinkedList();
        list.addHead(2);
        list.addHead(1);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.remove(4);
        System.out.println(list.toString());
    }
}
