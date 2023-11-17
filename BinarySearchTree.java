
/**
 * Write a description of class BST here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E extends Comparable<E>> 
{
    private BinarySearchTreeNode<E> root;
    private int size;
    
    public BinarySearchTree()
    {
        root = null;
        size = 0;    
    }


    public void insert(E element) {
       
        if (root == null) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
        }
        size++;
    }
    
    public E search(E element) {
        return root.search(element);
    }
    
    public E getMin() {
        return root.getMin();
    }
    
    public E getMax() {
        return root.getMax();
    }
    
    public boolean isEmpty() {
        return (root == null);
    }
    
    public int size() {
        return size;
    }
}
