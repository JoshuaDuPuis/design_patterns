package observer;

import java.util.ArrayList;

/**
 * The Customer class defines a customer of best-selling books and manages a 
 * wish list of a customer's favorite books.
 * @author Joshua DuPuis
 */
public class Customer implements Observer {

  private Subject subject;
  private String firstName;
  private String lastName;
  private ArrayList<Book> wishList;

  /**
   * The Customer constructor creates a Customer object and initializes its
   * wish list of books. It also sets the instance variables firstName and
   * lastName equal to the first and last names passed in by the user.
   * @param subject The subject of the wish list - in this program it will
   * be best-selling books
   * @param firstName The first name of the customer
   * @param lastName The last name of the customer
   */
  public Customer(Subject subject, String firstName, String lastName) {
    this.wishList = new ArrayList<Book>();
    this.subject = subject;
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    subject.registerObserver(this);
  }

  /**
   * The update method updates the customer's wish list by adding a new book
   * passed in by the user.
   * @param book The book to be added to the wish list
   */
  public void update(Book book) {
    wishList.add(book);
  }

  /**
   * The display method prints out the customer's wish list of books.
   */
  public void display() {
    System.out.println("Wish List:");
    for (Book book: wishList) {
        System.out.println( " - " + book.toString());
    }
  }
    
}
