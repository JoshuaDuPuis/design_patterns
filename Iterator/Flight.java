/**
 * The Flight class defines a Flight object which contains the flight number
 * origin, destination, duration of the flight, and number of transfers
 * @author Joshua DuPuis
 */
public class Flight {
  private String flightNum;
  private String from;
  private String to;
  private int duration;
  private int transfers;

  /**
   * The flight constructor builds a flight object and sets its its flight
   * number, origin, destination, duration, and transfers as passed in by
   * the user.
   * @param flightNum The flight number of the flight
   * @param from The origin of the flight
   * @param to The destination of the flight
   * @param duration The duration of the flight
   * @param transfers The number of transfers the flight contains
   */
  public Flight(String flightNum, String from, String to, int duration, int transfers) {
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.duration = duration;
    this.transfers = transfers;
  }

  /**
   * The getFrom method returns the origin of the flight
   * @return A String containing the origin of the flight
   */
  public String getFrom() {
    return this.from;
  }
  
  /**
   * The getTo method returns the destination of the flight
   * @return A string containing the destination of the flight
   */
  public String getTo() {
    return this.to;
  }

  /**
   * The getDuration method returns the duration of the flight
   * @return An int containing the duration of the flight in minutes
   */
  public int getDuration() {
    return this.duration;
  }
  
  /**
   * The getNumTransfers method returns the number of transfers in the route
   * @return An int containing the number of transfers in the route
   */
  public int getNumTransfers() {
    return this.transfers;
  }

  /**
   * The toString method returns a string containing all of the attributes of
   * a flight
   * @return A string containing the flight number, origin, destination, 
   * duration, and number of transfers
   */
  public String toString() {
    String ret = "Flight Number: " + this.flightNum + "\n";
    ret += "From: " + this.getFrom() + "\n";
    ret += "To: " + this.getTo() + "\n";
    ret += "Duration: " + this.getDuration()/60 + " hours ";
    ret += this.getDuration()%60 + " minutes\n";
    ret += this.getNumTransfers() + " Transfers";
    return ret;
  }

}
