
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
       tree.insert(4);
       tree.insert(1);
       tree.insert(3);
       tree.insert(2);
       System.out.println(tree.remove(3));
       System.out.println(tree.toString());
       tree.printTree();
    }
}
