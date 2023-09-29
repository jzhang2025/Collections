
/**
 * Creates a stack and tests the methods within the MyStack Class
 *
 * @author Joshua Zhang
 * @version 9/29/23
 */
import java.io.*;
import java.util.*;
public class testStack
{
    private MyStack testStack;

    /**
     * Constructs a new stack
     */
    public testStack()
    {
        testStack = new MyStack();
    }

    /**
     * Tests the methods in the MyStack Class
     *
     */
    public void testCase()
    { 
        System.out.println(testStack.isEmpty()); 
        System.out.println(testStack.size()); 
        testStack.push(3); 
        testStack.push(4);
        testStack.push(4);
        testStack.push(4);
        testStack.push(4);
        System.out.println(testStack.isFull());
        System.out.println(testStack.size()); 
        System.out.println(testStack.top()); 
        System.out.println(testStack.pop()); 
        System.out.println(testStack.size());
        System.out.println(testStack.toString()); 
    }
    
    public static void tester(){
        MyStack<String> stack = new MyStack();
        
        try {
            System.out.println(stack.pop());
        }catch (EmptyStackException e){
            System.out.println("Tried to pop from empty stack");
        }
    }
}

