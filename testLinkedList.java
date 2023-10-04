
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
        MyLinkedList testList = new MyLinkedList();
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
}
