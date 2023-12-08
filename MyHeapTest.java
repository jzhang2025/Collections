
/**
 * Write a description of class MyHeapTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MyHeapTest
{
    public void test() {
        MyHeap<Integer> tree = new MyHeap<Integer>();
        tree.add(5);
        tree.add(2);
        System.out.println(tree.isEmpty());
    }
}
