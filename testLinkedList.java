import java.util.*;
/**
 * Write a description of class testLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testLinkedList
{


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        OldMyLinkedList testList = new OldMyLinkedList();
        testList.addHead(3);
        System.out.println(testList.removeHead());
        testList.addTail(1);
        System.out.println(testList.removeHead());
        testList.addTail(2);
        System.out.println(testList.removeHead());
        testList.addTail(2);
        System.out.println(testList.isEmpty());
        testList.addHead(3);
        System.out.println(testList.size());
        System.out.println(testList.getHead());
        testList.addHead(5);
        testList.addHead(5);
        testList.addTail(4);
        System.out.println(testList.toString());
    }
    
    public void test2() {
        OldMyLinkedList testList = new OldMyLinkedList();
        testList.addHead(3);
        testList.addTail(2);
        testList.addHead(4);
        testList.addTail(1);
        System.out.println(testList.remove(2));
        System.out.println(testList.toString());
        testList.add(1,6);
        System.out.println(testList.toString());
    }
    
     public static void testLL() {
        OldMyLinkedList<Integer> list = new OldMyLinkedList<Integer>();
        list.addHead(1);
        list.addHead(2);
        System.out.println(list.size());
        if (list.remove(1) == null) {
            System.out.println("Failed remove index, is null");
        }
        System.out.println(list.size());
        if (list.get(0) != 2) {
           System.out.println("Failed get " + list.get(1));
        }
        list.addHead(3);
        System.out.println(list.size());
        list.add(1, 4);
        System.out.println(list.size());
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed add with index " + list.toString());
        }
        list.add(0, 9);
        System.out.println(list.size());
        if (!list.toString().equals("9, 3, 4, 2")) {
            System.out.println("Failed add with index " + list.toString());
        }
        if (list.getHead() != 9) {
            System.out.println("Your add method does not set the head variable when inserting at index 0");
        }
        list.add(4, 10);
        System.out.println(list.toString());
        list.addTail(5);
        if (!list.toString().equals("9, 3, 4, 2, 10, 5")) {
            System.out.println("Your add method does not set the tail variable when inserting at the index equal to the size of the list  " + list.toString());
        }
        list.remove(5);
        list.remove(4);
        
        
        if (list.remove(0) != 9) {
            System.out.println("Failed remove index " + list.toString());
        }
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed remove index " + list.toString());
        }
        
        list.add(3, 9);
        if (!list.toString().equals("3, 4, 2, 9")) {
            System.out.println("Failed add with index " + list.toString());
        }
        list.remove(3);
        
        
        list.set(1, 9);
        if (!list.toString().equals("3, 9, 2")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(0, 9);
        if (!list.toString().equals("9, 9, 2")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(0, 3);
        list.set(2, 9);
        if (!list.toString().equals("3, 9, 9")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(2, 2);
        
        list.insertSorted(4);
        if (!list.toString().equals("3, 4, 9, 2")) {
            System.out.println("Failed insertSorted " + list.toString());
        }
        if (list.remove(new Integer(2)) == null) {
            System.out.println("Failed remove element, is null");
        }
        if (!list.toString().equals("3, 4, 9")) {
            System.out.println("Failed remove element " + list.toString());
        }
        OldMyLinkedList<Integer> listSorted = new OldMyLinkedList<Integer>();
        listSorted.insertSorted(6);
        listSorted.insertSorted(2);
        listSorted.insertSorted(8);
        listSorted.insertSorted(9);
        listSorted.insertSorted(67);
        listSorted.insertSorted(0);
        listSorted.insertSorted(-6);
        if (!listSorted.toString().equals("-6, 0, 2, 6, 8, 9, 67")) {
            System.out.println("Failed insertSorted " + listSorted.toString());
        }
        
        
        
       
    }
    
    public void test3() {
        OldMyLinkedList testList = new OldMyLinkedList();
        System.out.println(testList.toString());
    }
}
