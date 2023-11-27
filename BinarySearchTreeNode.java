
/**
 * Represents a Binary Search Tree Node with the methods needed to make it work
 *
 * @author Joshua Zhang
 * @version November 17 2023
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
    
    public E getData() {
        return data;
    }
    
    /**
     * Inserts a new node into the tree and places it based off the integer 
     * value. Checks if the element provided is less than or more than the root. 
     *
     * @param element The element to add.
     */
    
    public void insert(E element) {
    if (element.compareTo(data) < 0) {
        if (left == null) {
            left = new BinarySearchTreeNode<>(element);
        } else {
            left.insert(element); 
        }
    } else if (element.compareTo(data) > 0) {
        if (right == null) {
            right = new BinarySearchTreeNode<>(element);
        } else {
            right.insert(element); 
        }
    }
    }
    
    /**
     * Checks if the element provided is in the tree and returns it. 
     *
     * @return The element if it is in the tree and null if the provided 
     * element is not in the tree
     */
    public E search(E element) {
    if (element.compareTo(data) == 0) {
        return data; 
    } else if (element.compareTo(data) < 0 && left != null) {
        return left.search(element); 
    } else if (element.compareTo(data) > 0 && right != null) {
        return right.search(element); 
    }
    return null;    
    }
    
    /**
     * Searches for the smallest integer in the tree
     *
     * @return The smallest element in the tree 
     */
    public E getMin() {
        if (left == null) { 
            return data;
        } else {
            return left.getMin();
        }
    }

    /**
     * Searches for the largest integer in the tree
     *
     * @return The largest element in the tree 
     */
    public E getMax() {
        if (right == null) { 
            return data;
        } else {
            return right.getMax();
        }
    }
    
    /**
     * Returns the tree in string format from smallest to largest node
     *
     * @return the nodes in the tree from smallest to largest in string form
     */
    
    public String toString() {
        String listString = "";
        if (left != null) {
            listString += left.toString() + ", ";
        } 
        listString += data; 
        if (right != null) {
            listString += ", " + right.toString();
        }
        return listString;
    }
    
    /**
     * Returns the depth of the binary tree
     *
     * @return the depth of the tree
     */
    
    public int getDepth() {
        int depth = 1; 
        if (left == null && right == null) {
            return depth;
        } else if (left != null && (right == null 
        || left.getDepth() > right.getDepth())) {
            return depth + left.getDepth();
        } else {
            return depth + right.getDepth();
        }
            
    }
        
    /**
     * Removes and returns the given element from the binary tree. If the 
     * element is not in the tree the method returns null
     *
     * @return the removed node or null if the given element is not in the 
     * binary tree
     */
    
    public BinarySearchTreeNode remove(E element) {
         if (element.compareTo(data) < 0) {
            if (left == null) {
                return this;
            } else {
                left = left.remove(element);
                return this;
            }
        } else if (element.compareTo(data) > 0) {
            if (right == null) {
                return this;
            } else {
                right = right.remove(element);
                return this;
            }
        } else {
            if (left == null && right == null) {
                return null;
            } else if (left != null && right == null) {
                return left;
            } else {
                return right;
            }
        }
    }
    
    public BinarySearchTreeNode removeMin(E element) {
        if (left == null && right == null) {
            return null;
        } else if (left == null && right != null) {
            return this; 
        } else {
            left = left.remove(left.getMin());
            return this;
        }
    }
    
    /**     * Prints elements as stored in the tree
     *
     * @param maxElementWidth The maximum space allowed for the string form
     *                        of the element.
     */
    public void printTree(int maxElementWidth) {
        int maxSize = (int) Math.pow(2, (getDepth() + 1));
        String[] elements = new String[maxSize];

        // Build array of elements
        printTree(elements, 0, maxElementWidth);

        // Print element properly spaced
        int fullWidth = (int) Math.pow(2, getDepth()) * (maxElementWidth + 1);
        for (int i = 0; i < getDepth() + 1; i++) {
            String connectionsLevel = "";
            String elementsLevel = "";

            for (int j = (int) Math.pow(2, i) - 1; j < (int) Math.pow(2, i + 1) - 1; j++) {

                // Process arrows for this level
                String arrow = "  ";
                int elementLength = arrow.length();
                if (elements[j] != null) {
                    if (j % 2 == 1) { // Odd is left child
                        arrow = " /";
                    } else { // Even is right child
                        arrow = "\\ ";
                    }
                }

                // Center within maxElementWidth
                String leftPadStr = ""; // Default
                String rightPadStr = ""; // Default
                int leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                int rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }
                connectionsLevel += leftPadStr + arrow + rightPadStr;

                // Process elements for this level
                elementLength = 0;
                if (elements[j] != null) {
                    elementLength = elements[j].toString().length();
                }

                // Center within maxElementWidth
                leftPadStr = ""; // Default
                rightPadStr = ""; // Default
                leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }

                if (elements[j] != null) {
                    elementsLevel += leftPadStr + elements[j] + rightPadStr;
                } else {
                    elementsLevel += leftPadStr + rightPadStr;
                }
            }

            if (i > 0) { // Do not print arrows for root
                System.out.println(connectionsLevel);
            }
            System.out.println(elementsLevel);
        }
    }

    // build array of element strings
    private void printTree(String[] elements, int nodeNum, int maxElementWidth) {
        elements[nodeNum] = data.toString();
        if (elements[nodeNum].length() > maxElementWidth) {
            elements[nodeNum] = elements[nodeNum].substring(0, maxElementWidth);
        }
        if (left != null) {
            left.printTree(elements, (nodeNum + 1) * 2 - 1, maxElementWidth);
        }
        if (right != null) {
            right.printTree(elements, (nodeNum + 1) * 2, maxElementWidth);
        }
    }
}
