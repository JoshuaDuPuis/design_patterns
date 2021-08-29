package strategy;
import java.util.ArrayList;

/**
 * The LinearSearch class implements a linear search algorithm to determine
 * whether a specific person is included in a list of names provided by the 
 * user.
 * @author Joshua DuPuis
 */
public class LinearSearch implements SearchBehavior{

  /**
   * The contains method checks a list of guests provided by the user to
   * determine whether a specific person is contained in the list.
   * @param data The list of people passed in by the user
   * @param item The person the method will check to see if they are in the 
   * list
   * @return Returns true if the person is already in the list, false if not
   */
  public boolean contains(ArrayList<String> data, String item) {
    ArrayList<String> copy = new ArrayList<String>();
    for (int i = 0; i < data.size(); ++i) {
    copy.add(data.get(i));
    }
    for (int i = 0; i < copy.size(); ++i) {
      copy.set(i, copy.get(i).toLowerCase());
    }
      item = item.toLowerCase();
      for (String name: copy) {
        if (name.equals(item)) {
          return true;
        }
      }
    return false;
  }

}