package strategy;

import java.util.ArrayList;

/**
 * The BinarySearch class implements the SearchBehavior interface, and defines
 * a binary search algorithm to determine whether a specified person is
 * included in a list of names passed in by the user.
 * @author Joshua DuPuis
 */
public class BinarySearch implements SearchBehavior{

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
    sortAlphabetically(copy);
    sortAlphabetically(data);
    for (String name: copy) {
      if (name.equals(item)) {
        return true;
      }
    }   
    return false;
  }

  /**
   * The sortAlphabetically method sorts a list of people in alphabetical
   * order, regardless of capitalization of their name.
   * @param data The list of people to be sorted
   * @return nothing is returned
   */
  private void sortAlphabetically(ArrayList<String> data){
    boolean hasSwapped = true;
    while(hasSwapped) {
      hasSwapped = false;
      for (int i = 0; i < data.size()-1; i++) {
        if (data.get(i).compareTo(data.get(i+1)) > 0) {
          String temp = data.get(i);
          data.set(i, data.get(i+1));
          data.set(i+1, temp);
          hasSwapped = true;
        }
      }
    }
  }
}