
/**
 * Write a description of class BSTNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTreeNode<E extends Comparable<E>> 
{
    private E data;
    private BinarySearchTreeNode<E> left;
    private BinarySearchTreeNode<E> right;
  
    public BinarySearchTreeNode(E element)
    {
        data = element;
    }

    public E getData()
    {
        return data;
    }
    
    public void setData(E element) {
        data = element;
    }
    
    public BinarySearchTreeNode<E> getLeft() {
        return left;
    }
    
    public BinarySearchTreeNode<E> getRight() {
        return right;
    }
    
    public void insert (E element) {
        
        if (element.compareTo(data) < 0) {
            if (left == null) {
                left = new BinarySearchTreeNode<E>(element);
            } else {
                
            }
        }
       
    }
}
