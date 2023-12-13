import java.util.Arrays;
/**
 * Creates a min heap data structure 
 *
 * @author Joshua Zhang 
 * @version 1.0
 */

public class MyHeap <E extends Comparable<E>>
{
    private E[] elemArray;
    private int lastNode;

    /**
     * Constructor for objects of class MyHeap
     */
    public MyHeap()
    {
        elemArray = (E[]) new Comparable[16];
        lastNode = -1;
    }

    public void add(E element)
    {
        lastNode++;
        elemArray[lastNode] = element;
        if (lastNode == -1) {
            return;
        } else {
            int child = lastNode;
            int parent = (child-1)/2;
            while (child != 0 && (element.compareTo(elemArray[parent]) < 0)) {
                E temp = elemArray[parent];
                elemArray[parent] = element;
                elemArray[child] = temp;
                child = parent;
                parent = (child - 1)/2;
            }
        }
    }
            
    public E getMin() {
        return elemArray[0];
    }
    
    public E removeMin() {
        if (lastNode == -1) {
            return null; 
        }
        E minElement = elemArray[0]; 
        elemArray[0] = elemArray[lastNode];
        elemArray[lastNode] = null;
        lastNode--;
        int parent = 0;
        boolean heapPropertyViolated = true;
    
        while (heapPropertyViolated == true) {
            int leftChild = 2 * parent + 1;
            int rightChild = 2 * parent + 2;
            int smallest = parent;
            if (leftChild <= lastNode && elemArray[leftChild].compareTo(elemArray[smallest]) < 0) {
                smallest = leftChild;
            }
            if (rightChild <= lastNode && elemArray[rightChild].compareTo(elemArray[smallest]) < 0) {
                smallest = rightChild;
            }
    
            if (smallest == parent) {
                heapPropertyViolated = false;
            } else {
                E temp = elemArray[parent];
                elemArray[parent] = elemArray[smallest];
                elemArray[smallest] = temp;
                parent = smallest;
            }
        }
    
        return getMin();
    }

    
    public boolean isEmpty() {
        return (lastNode == -1);
    }
    
    public int size() {
        return (lastNode += 1);
    }
    
    /**
     * Prints elements as stored in the tree
     *
     * @param maxElementWidth The maximum space allowed for the string form
     *                        of the element.
     */
    public void printTree(int maxElementWidth) {
        int depth = (int) (Math.log(lastNode + 1) / Math.log(2)) + 1;
        int maxSize = (int) Math.pow(2, depth) - 1;
        String[] elements = new String[maxSize];

        // Build array of elements
        printTree(elements, maxElementWidth);

        // Print element properly spaced
        int fullWidth = (int) Math.pow(2, depth - 1) * (maxElementWidth + 1);
        for (int i = 0; i < depth; i++) {
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
    private void printTree(String[] elements, int maxElementWidth) {
        for (int i = 0; i <= lastNode; i++) {
            elements[i] = elemArray[i].toString();
        }
    } 
    
    public String toString() {
        return Arrays.toString(elemArray);
    }
}
