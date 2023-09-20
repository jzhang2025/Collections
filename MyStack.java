
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class MyStack
{
    private int[] stack;
    private int size;
   
    public void MyStack(int length)
    {
       stack = new int[length];
    }


    public void push(int element)
    {
        stack[size] = element;
        size++;
    }
    
    public int pop()
    {
       if (isEmpty() == true){
           return 0;
       }
       size--;
       return stack[size];
    }
    
    public boolean isEmpty()
    {
        if (size() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int top()
    {
        return stack[size-1];
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isFull()
    {
        if (size() >= stack.length){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString()
    {
      int[] newArr = new int [size];
      for (int i = 0; i < size; i++){
          newArr[i] = stack[size - 1];
      }
      
      return Arrays.toString(newArr);
    }
    
    public void testCase()
    { 
        System.out.println(isEmpty()); 
        System.out.println(size()); 
        push(3); 
        push(4);
        System.out.println(size()); 
        System.out.println(top()); 
        System.out.println(pop()); 
        System.out.println(stack.toString()); 
    }
}
