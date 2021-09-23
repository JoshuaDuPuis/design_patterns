/**
 * The Airline class creates an Airline object that will store flights
 * @author Joshua DuPuis
 */
public class Airline {

  private String title;
  private Flight[] flights;
  private int size;

  /**
   * The Airline constructor creates an airline object and assigns it a
   * specific title passed in by the user.
   * @param title A String containing the title of the airline
   */
  public Airline(String title) {
    this.title = title;
    size = 1;
    flights = new Flight[size];
  }

  /**
   * The addFlight method creates a flight object and adds it to the airline's
   * array of flights.
   * @param flightNum A String containing the flight number of the flight
   * @param from A String containing the origin of the flight
   * @param to A String containing the destination of the flight
   * @param duration An int containing how long the flight is in minutes
   * @param transfers An int containing the number of layovers the flight 
   * contains
   */
  public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
    Flight flight = new Flight(flightNum, from, to, duration, transfers);
    if (flights[size-1]!=null) {
        flights = growArray(flights);
        size *= 2;
    }
    int findNullIndex = 0;
    while (flights[findNullIndex] != null) {
        findNullIndex++;
    }
    flights[findNullIndex] = flight;
  }


  /**
   * The getTitle method returns the title of the airline
   * @return A String containing the title of the airline
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * The growArray method takes in an array of Flights and increases its size
   * by one so that a new flight can be added to the array.
   * @param flights The array of flights to be doubled in size
   * @return The new array of flight objects that is twice the size of the 
   * original array
   */
  private Flight[] growArray(Flight[] flights){
    Flight[] newArray = new Flight[(flights.length)*2];
    for (int i = 0; i < flights.length; i++) {
        newArray[i] = flights[i];
    }
    return newArray;
  }


  /**
   * The createIterator method creates a new FlightIterator object to iterate
   * thorugh the array of flights
   * @return The newly created FlightIterator object
   */
  public FlightIterator createIterator() {
    return new FlightIterator(flights);
  }

}