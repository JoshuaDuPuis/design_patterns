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
  public Store(Subject subject) {
    this.subject = subject;
    this.bestSellers = new LinkedList<Book>();
    this.subject = subject;
    this.subject.registerObserver(this);
  }

  /**
   * The update method updates the store's queue of best-selling books by
   * adding a new book passed in by the user and removing the first book in
   * the queue if the queue is full.
   * @param book The new best-selling book passed in by the user
   */
  public void update(Book book) {
    this.bestSellers.add(book);
    if (getNumOfBooks() == 6) {
        this.bestSellers.remove();
    } 
  }

  /**
   * The display method prints the store's list of best-selling books.
   */
  public void display() {
    System.out.println("Top 5 Best Sellers:");
    for (Book book: bestSellers) {
        System.out.println( " - " + book.toString());
    }
    System.out.println();    
  }
  
  /**
   * The getNumOfBooks method is a private method that determines how many
   * books are currently in the best-sellers list.
   * @return Returns the number of books in the list
   */
  private int getNumOfBooks() {
    int numOfBooks = 0;
    for (Book book: bestSellers) {
      numOfBooks++;
    }
    return numOfBooks;
  }

}
