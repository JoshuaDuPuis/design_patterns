package observer;

/**
 * The Observer class is an interface to both a store and customer classes,
 * providing them with an update method to update their respective list of
 * subjects and a display method to display each class' list.
 * @author Joshua DuPuis
 */
public interface Observer {

  /**
   * The update method allows the user to update the list of best-selling books
   * by adding a new book to the list.
   * @param book The book to be added to the list of best-sellers
   */
  public void update(Book book);

  /**
   * The display method displays the list of best-selling books contained in
   * either a store or a customer object.
   */
  public void display();
}
