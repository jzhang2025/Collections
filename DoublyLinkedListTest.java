
import java.util.*;
/**
 * Write a description of class DoublyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoublyLinkedListTest
{
     public static void testWithArrayList() {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        Random rand = new Random();
        int i = 0;
        int head = 0;
        while (aList.toString().equals("[" + list.toString() + "]") && i < 10000) {
            int j = rand.nextInt(8);
            if (j == 0) {
                int index = rand.nextInt(list.size() + 1);
                int element = rand.nextInt(99999);
                aList.add(index, element);
                list.add(index, element);
            }
            if (j == 1) {
                int element = rand.nextInt(99999);
                aList.add(element);
                list.add(element);
            }
            if (j == 2 && list.size() != 0) {
                int index = rand.nextInt(list.size());
                int element = rand.nextInt(99999);
                aList.set(index, element);
                list.set(index, element);
            }
            if (j == 3 && !list.isEmpty()) {
                int index = rand.nextInt(list.size());
                aList.remove(index);
                list.remove(index);
            }
            if (j == 4) {
                int element = rand.nextInt(99999);
                aList.remove(new Integer(element));
                list.remove(new Integer(element));
            }
            if (j == 5 && list.size() != 0) {
                int index = rand.nextInt(list.size());
                if (aList.get(index).compareTo(list.get(index)) != 0) {
                    i = 99999999;
                    System.out.println(aList.get(index) + " " + list.get(index));
                }
            }
            if (j == 6 && list.size() != 0) {
                list.removeHead();
                aList.remove(0);
                head++;
            }
            if (j == 7) {
                int element = rand.nextInt(99999);
                list.addTail(element);
                aList.add(element);
            }
            i++;
        }
        System.out.println(aList.toString().equals("[" + list.toString() + "]") + " " + i + " " + head);
    }
  
    
    
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
        list.addTail(3);
        list.addTail(5);
        list.insertSorted(4);
        System.out.println(list.toString());
    }
}
