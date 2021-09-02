package observer;

import java.util.Queue;
import java.util.LinkedList;

/**
 * The Store class holds a list of the five current best-selling books.
 * @author Joshua DuPuis
 */
public class Store implements Observer{
  
  private Subject subject;
  private String title;
  private Queue<Book> bestSellers;

  /**
   * The Store constructor constructs a Store object and sets the private
   * instance Subject to the Subject passed in by the user. It also sets the
   * Store title instance variable equal to the title passed in by the user.
   * @param subject The subject of the items the store keeps track of - in this
   * program it will be best-selling books
   * @param title The title of the store passed in by the user
   */
  public Store (Subject subject, String title) {
    this.subject = subject;
    this.title = title;
    this.bestSellers = new LinkedList();
  }

  /**
   * The update method updates the store's queue of best-selling books by
   * adding a new book passed in by the user and removing the first book in
   * the queue if the queue is full.
   * @param book The new best-selling book passed in by the user
   */
  public void update(Book book) {

  }

  /**
   * The display method prints the store's list of best-selling books.
   */
  public void display() {

  }
}
