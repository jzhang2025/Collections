
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
       tree.insert(4);
       tree.insert(2);
       tree.insert(7);
       tree.insert(1);
       System.out.println(tree.search(2));
       System.out.println(tree.search(9));
    }
}
