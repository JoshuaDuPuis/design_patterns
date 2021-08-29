package strategy;
import java.util.ArrayList;

/**
 * The GuestList class creates a list of guests to an event
 * of which names can be added and removed from.
 * @author Joshua DuPuis
 */
public class GuestList {
  private String title;
  private ArrayList<String> people;
  private SearchBehavior searchBehavior;

  /**
   * The GuestList constructor creates a GuestList object and defines whether
   * the method used to serach it will be a binary search or a linear search.
   * @param title The title of the GuestList entered by the user
   */
  public GuestList(String title) {
    this.title = title;
    people = new ArrayList<String>();
    this.searchBehavior = new LinearSearch();
  }

  /**
   * The add method adds a person to the list if the list does not already
   * contain them
   * @param person The person to be added to the list
   * @return Returns true if the person is added to the list, false if the
   * person is already in the list
   */
  public boolean add(String person) {
    if (searchBehavior.contains(people, person)) {
      return false;
    }
    return people.add(person);    
  }

  /**
   * The remove method removes a person from the list if the list does indeed
   * contain them
   * @param person The person to be removed from the list
   * @return Returns true if the person was removed from the list and false
   * otherwise
   */
  public boolean remove(String person) {
    if (searchBehavior.contains(people, person)) {
      int index = getIndex(person);
      people.remove(index);
      return true;
    }
    return false;
  }

  /** 
   * The getTitle method returns the title of the GuestList
   * @return Returns the title of the GuestList
   */
  public String getTitle() {
    return title;
  }

  /**
   * The setSearchBehavior method allows the user to specify what type of
   * search they would like the program to execute when determining whether a
   * person is already included in a GuestList object.
   * @param searchBehavior The type of search the user wants to perform on
   * the GuestList
   */
  public void setSearchBehavior(SearchBehavior searchBehavior) {
    this.searchBehavior = searchBehavior;
  }

  /**
   * The getList method returns the list of names in the GuestList object
   * @return Returns the list of people in the GuestList object
   */
  public ArrayList<String> getList() {
    return people;
  }

  /**
   * The getIndex method retrieves the index of a specified name in the
   * ArrayList of names in the GuestList object.
   * @param person The name to search for
   * @return An int equal to the index of the specified name in the list
   */
  private int getIndex(String person) {
    int index = 0;
    for (int i = index; i < people.size(); i++) {
      if (people.get(i).equals(person)) {
        index = i;
      }
    }
    return index;
    }
}