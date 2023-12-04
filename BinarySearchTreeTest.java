
/**
 * Write a description of class BinarySearchTreeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.*;
public class BinarySearchTreeTest
{
    public void test() {
       BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
       tree.insert(3);
       tree.insert(7);
       tree.insert(5);
       tree.insert(2);
       tree.insert(1);
       tree.insert(0);
       System.out.println(tree.getDepth());
       System.out.println(tree.toString());
       tree.printTree();
    }
    
    public static void testBST() {
        Random rand = new Random();
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        for (int i = 0; i < 10; i++) {
            bst.insert(rand.nextInt(10));
        }
        bst.printTree();
        System.out.println("Depth is " + bst.getDepth());
    }
    
    public static void testBSTSort() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(3);
        list.add(5);
        list.add(0);
        bstSort(list);
        System.out.println(list.toString());
    }
    
    public static void bstSort(MyLinkedList list) {
        // do this
        BinarySearchTree bst = new BinarySearchTree();
        while (!list.isEmpty()) {
            bst.insert(list.removeHead());
        }
        while (!bst.isEmpty()) {
            list.addTail(bst.removeMin());
            System.out.println(bst.size());
        }
        
    }
}
