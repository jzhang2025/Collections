
/**
 * Write a description of class MyStackLLTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStackLLTest
{


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        MyStackLL testStack = new MyStackLL();
        testStack.push(4);
        System.out.println(testStack.top());
        testStack.push(2);
        System.out.println(testStack.pop());
        System.out.println(testStack.size());
        testStack.pop();
        System.out.println(testStack.isEmpty());
        System.out.println(testStack.isFull());
        testStack.push(4);
        testStack.push(3);
        testStack.push(1);
        System.out.println(testStack.toString());
    }
    
    public static boolean wellFormedExpressionsMethod(String s) {
    MyStackLL<Character> stack = new MyStackLL<>();
    String openChars = "{[(";
    String closeChars = "}])";

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (openChars.indexOf(c) != -1) {
            stack.push(c);
        } else if (closeChars.indexOf(c) != -1) {
            if (stack.isEmpty()) {
                return false;
            }

            char top = stack.pop();
            if (!((top == '(' && c == ')') || (top == '[' && c == ']') 
            || (top == '{' && c == '}'))) {
                return false;
            }
        }
    }

    return stack.isEmpty();
    }
}
