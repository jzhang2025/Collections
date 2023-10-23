
/**
 * Write a description of class SquareRoot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareRoot
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SquareRoot
     */
    public static double SquareRoot(double num)
    {
        double maxpoint = num;
        double midpoint = num/2;
        double minpoint = 0;
        int counter = 0;
        while (Math.abs(midpoint * midpoint - num) > 0.0001) {
            counter++;
            if (midpoint * midpoint > num) {
                maxpoint = midpoint;
            }
            if (midpoint * midpoint < num) {
                minpoint = midpoint;
            }
            midpoint = (minpoint + maxpoint)/2;
        }
        System.out.println(counter);
        return midpoint;
        
        
    }

}
