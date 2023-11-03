
/**
 * Write a description of class Castaways here.
 *
 * @author Joshua Zhang 
 * @version Version 1.0
 */
public class Castaway implements Comparable<Castaway>
{
    private static String[] lastName = {"",
                                    "Grumby",
                                    "Howell",
                                    "Howell",
                                    "Grant",
                                    "Hinkley",
                                    "Summers"};
    private static String[] firstName = {"Gilligan",
                                    "Jonas",
                                    "Thurston",
                                    "Lovey",
                                    "Ginger",
                                    "Roy",
                                    "Mary Ann"};
    private static int[] score = {72, 85, 82, 96, 90, 96, 88};
    private static String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
    
    private String last;
    private String first;
    private int personScore;
    private String personGender;

    /**
     * Constructor for objects of class Castaways
     */
    public Castaway(String lastName, String firstName, int score, String gender)
    {
        lastName = last;
        firstName = first;
        score = personScore;
        gender = personGender;
        
    }
    
    public int compareTo(Castaway other) {
         return Integer.compare(personScore, other.personScore);
    }
    
    private boolean equals(Castaway other) {
        return lastName.equals(other.lastName) && firstName.equals(other.firstName);
    }
    
    
    public String toString() {
        return firstName + " " + lastName + " " + score + " " + gender;
    }
    
    public static void testCastawayLinkedList() {
        MyLinkedList<Castaway> list = new MyLinkedList<Castaway>();
        for (int i = 0; i < score.length; i++) {
            list.insertSorted(new Castaway(firstName[i], lastName[i], score[i], gender[i]));
        }
        System.out.println(list.toString()); 
        System.out.println(list.remove(new Castaway(firstName[0], lastName[0], score[0], gender[0])));
        System.out.println(list.toString());
        
    }
    
    

}
