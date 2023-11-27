
/**
 * Write a description of class BinarySearchTreeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTreeTest
{
    public void test() {
       BinarySearchTree tree = new BinarySearchTree();
       tree.insert(3);
       tree.insert(1);
       tree.insert(2);
       System.out.println(tree.remove(1));
    }
}
