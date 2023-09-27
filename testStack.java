
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class testStack
{
    // instance variables - replace the example below with your own
    private MyStack testStack;

    /**
     * Constructor for objects of class Test
     */
    public testStack()
    {
        testStack = new MyStack();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void testCase()
    { 
        System.out.println(testStack.isEmpty()); 
        System.out.println(testStack.size()); 
        testStack.push(3); 
        testStack.push(4);
        System.out.println(testStack.size()); 
        System.out.println(testStack.top()); 
        System.out.println(testStack.pop()); 
        System.out.println(testStack.size());
        //System.out.println(testStack.toString(testStack)); 
    }
}
