package observer;

import java.util.ArrayList;

/**
 * The BestSellers class creates a list of best-selling books and allows the
 * user to add or remove books from the list.
 */
public class BestSellers implements Subject{
  private ArrayList<Observer> observers;
  private ArrayList<Book> bestSellers;

  /**
   * The BestSellers constructor initializes two ArrayLists, observers and
   * bestSellers, which will contain each registered observer and a list of
   * the best-selling books, respectively.
   */
  public BestSellers() {
    observers = new ArrayList<Observer> ();
    bestSellers = new ArrayList<Book> ();
  }

  /**
   * The registerObserver method registers an observer to receive updates when
   * the list of best-selling books changes.
   * @param observer The observer to be registered
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * The removeObserver method removes an observer from receiving updates when
   * the list of best-selling books changes.
   * @param observer The observer to be removed
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * The notifyObservers method notifies all of the registered observers
   * whenever a new book is added to the best-sellers list.
   * @param book The new book added to the bestsellers list
   */
  public void notifyObservers(Book book) {
    for (Observer clients: observers) {
        clients.update(book);
    }
  }

  /**
   * The addBook method adds a book to the list of best-sellers
   * @param book
   */
  public void addBook(Book book) {
    bestSellers.add(book);
    this.notifyObservers(book);
  }
}
