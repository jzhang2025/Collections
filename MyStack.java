/**
 * MyStack represents a stack data structure using an array 
 * that follows the Last In First Out (LIFO) principle.
 *
 * @param <E> the type of elements to be stored in the stack
 * @author Joshua Zhang
 * @version 9/27/23
 */
import java.io.*;
import java.util.*;

public class MyStack<E> {
    private E[] stack; 
    private int size;   

    /**
     * Constructs a new stack with a size of 100
     */
    public MyStack() {
        size = 0;
        stack = (E[]) new Object[100];
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element the element to be pushed onto the stack
     * @throws IndexOutOfBoundsException if the stack is full
     */
    public void push(E element) throws IndexOutOfBoundsException {
        if (size == 100) {
            throw new IndexOutOfBoundsException();
        } else {
            stack[size] = element;
            size++;
        }
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element at the top of the stack
     * @throws IndexOutOfBoundsException if the stack is empty
     */
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            size--;
            return stack[size];
        }
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (size() == 0);
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     */
    public E top() {
        return stack[size - 1];
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return (size() >= stack.length);
    }

    /**
     * Prints out a string listing the numbers in the stack
     *
     * @return a string list of the numbers in the stack
     */
    public String toString() {
        String stackString = "";

        for (int i = 0; i < size; i++) {
            stackString += stack[i];
            if (i < size - 1) {
                stackString += ", ";
            }
        }

        return stackString;
    }
}
