
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
       tree.insert(7);
       tree.insert(3);
       tree.insert(5);
       System.out.println(tree.removeMax());
       System.out.println(tree.toString());
       tree.printTree();
    }
}
