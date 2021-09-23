import java.util.Iterator;

/**
 * The FlightIterator class creates an iterator to analyze an array of fights
 * @author Joshua DuPuis
 */
public class FlightIterator implements Iterator{
  private Flight[] flights;
  private int position;

  /**
   * The FlightIterator constructor creates a FlightIterator object that will
   * iterate through an array of flights passed in by the user.
   * @param flights The array of flights to be iterated through
   */
  public FlightIterator(Flight[] flights) {
    this.flights = flights;
    position = 0;
  }

  /**
   * The hasNext method checks to see if the array of flights has another
   * flight object after the object the iterator is on
   * @return Returns true if there is another flight object in the array of
   * flights after the iterator, false if there is not
   */
  public boolean hasNext() {
    return flights[position] != null;
  }

  /**
   * The next method returns the next flight after the iterator in the array of
   * flights
   * @return The next flight in the array of flights
   */
  public Flight next() {
    if (this.hasNext()) {
        position++;
        return flights[position-1];
    }
    return null;
  }
}
