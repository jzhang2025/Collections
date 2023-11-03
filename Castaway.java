
/**
 * Write a description of class Castaways here.
 *
 * @author Joshua Zhang 
 * @version Version 1.0
 */
public class Castaway implements Comparable<Castaway>
{
    
    private String last;
    private String first;
    private int personScore;
    private String personGender;

    /**
     * Constructor for objects of class Castaways
     */
    public Castaway(String lastName, String firstName, int score, String gender)
    {
        last = lastName;
        first = firstName;
        personScore = score;
        personGender = gender;
        
    }
    
    @Override
    public int compareTo(Castaway other) {
        if (this.last.compareTo(other.last) != 0) {
            return this.last.compareTo(other.last);
        } else {
            return this.first.compareTo(other.first);
        }
         
    }
    
    public boolean equals(Castaway other) {
        return (this.compareTo(other) == 0);
    }
    
    public String toString() {
        return first + " " + last + " " + personScore + " " + personGender;
    }
    
    public static void testCastawayLinkedList() {
        
    String[] lastName = {"",
                                    "Grumby",
                                    "Howell",
                                    "Howell",
                                    "Grant",
                                    "Hinkley",
                                    "Summers"};
    String[] firstName = {"Gilligan",
                                    "Jonas",
                                    "Thurston",
                                    "Lovey",
                                    "Ginger",
                                    "Roy",
                                    "Mary Ann"};
    int[] score = {72, 85, 82, 96, 90, 96, 88};
    String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
    
    
    MyLinkedList<Castaway> list = new MyLinkedList<Castaway>();
    for (int i = 0; i < gender.length; i++) {
            list.insertSorted(new Castaway(lastName[i], firstName[i], score[i], gender[i]));
        }
    System.out.println(list.toString()); 
    System.out.println(list.remove(new Castaway("Grant" , "Ginger", 90, "F")));
    System.out.println(list.toString());
    }
}
