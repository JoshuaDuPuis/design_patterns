package observer;

public class Book {

  private String title;
  private String authorFirstName;
  private String authorLastName;

  /**
   * The Book constructor initializes a book object and sets its instance
   * variables authorFirstName and authorLastName equal to the names
   * passed in by the user. It also sets the title instance variable equal
   * to the title passed in by the user.
   * @param title The title of the book
   * @param authorFirstName The first name of the author
   * @param authorLastName The last name of the author
   */
  public Book(String title, String authorFirstName, String authorLastName) {
    this.title = title;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
  }

  /**
   * The getTitle method returns the title of the book.
   * @return Returns a string - the title of the book
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * The getAuthorFirstName method returns the first name of the author of a 
   * specific book object.
   * @return Returns a string - the first name of the author of a book
   */
  public String getAuthorFirstName() {
    return this.authorFirstName;
  }

  /**
   * The getAuthorLastName method returns the last name of the author of a
   * specific book object.
   * @return Returns a string - the last name of the author of a book
   */
  public String getAuthorLastName() {
    return this.authorLastName;
  }

  /**
   * The toString method concatenates the title of the book amd the name of
   * the author into a single string
   * @return A string containing the title and author of the specific book
   */
  public String toString() {
    return this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
  }
    
}
