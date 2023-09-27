
/**
 * Creates an array that uses Last In First Out (LIFO) to organize 
 * an int array. 
 *
 * @author Joshua Zhang
 * @version 9/27/23
 */
import java.io.*;
import java.util.*;
public class MyStack<E>
{
    private E[] stack;
    private int size;
   
    public void MyStack()
    {
       size = 0;
       stack = (E[]) new Object[100];
    }

    
    public void push(E element) throws IndexOutOfBoundsException
    {
        if (size == 100){
            throw new IndexOutOfBoundsException();
        }else{
            stack[size] = element;
            size++;
        }
    }
    
    public E pop() throws IndexOutOfBoundsException
    {   
        if (isEmpty() == true){
            throw new IndexOutOfBoundsException();
        }else{
        size--;
        return stack[size];
        }
    }
    
    public boolean isEmpty()
    {
        return (size() == 0);      
    }
    
    public E top()
    {
        return stack[size-1];
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isFull()
    {
        return (size() >= stack.length);  
    }
    
    public String toString()
    {
        String stackString = "";
        for(int i = 0; i < size; i++){
            stackString = stackString + stack[i];
        }
        return stackString; 
    }
}
