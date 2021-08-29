package strategy;
import java.util.ArrayList;
/**
 * The SearchBehavior class serves as an interface to both a LinearSearch and
 * BinarySearch class, providing them with a method to see if an item is
 * contained in an ArrayList.
 * @author Joshua DuPuis
 */
public interface SearchBehavior {

  /**
   * The contains method checks to see if an ArrayList of guests contains
   * a specific person 
   * @param data The list of guests to be analyzed
   * @param item The person being checked for in the guest list
   * @return boolean True if the person is in the list, false if they are not
   */
  public boolean contains(ArrayList<String> data, String item);
}