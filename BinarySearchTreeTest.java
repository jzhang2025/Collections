
/**
 * Write a description of class BinarySearchTreeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
}
