import java.util.ArrayList;

/**
 * The HousePlan class creates a HousePlan with the specific features and
 * elements of a particular home.
 * @author Joshua DuPuis
 */
public abstract class HousePlan {
  protected ArrayList<String> materials;
  protected ArrayList<String> features;
  private int numRooms;
  private int numWindows;
  private int squareFeet;  

  /**
   * The HousePlan constructor constructs a HousePlan with the number of rooms,
   * number of windows, and square footage specified by the user.
   * @param numRooms The number of rooms the house contains
   * @param numWindoes
   * @param squareFeet
   */
  public HousePlan(int numRooms, int numWindows, int squareFeet) {
    materials = new ArrayList<String>();
    features = new ArrayList<String>();
    this.numRooms = numRooms;
    this.numWindows = numWindows;
    this.squareFeet = squareFeet;
  }

  /**
   * The setMaterials method is an abstract method that when defined, will 
   * place the materials needed to build a house in the materials ArrayList
   */
  protected abstract void setMaterials();

  /**
   * The setFeatures method is an abstract method that when defined, will
   * place the features desired to build a specific house in the features
   * ArrayList.
   */
  protected abstract void setFeatures();

  /**
   * The getMaterials method will return the materials needed to build a
   * specific house.
   * @return Returns the ArrayList of all the materials needed to build a house
   */
  public ArrayList<String> getMaterials() {
    return materials;
  }

  /**
   * The getFeatures method will return the features desired in a specific
   * home.
   * @return Returns an ArrayList of the features desired to build a home
   */
  public ArrayList<String> getFeatures() {
    return features;
  }

  /**
   * The getNumRooms method returns the number of rooms in a specific HousePlan
   * @return An int containing the number of rooms in a specific HousePlan
   */
  public int getNumRooms() {
    return numRooms;
  }

  /**
   * The getNumWindows method returns the number of windows in a specific HousePlan
   * @return An int containing the number of windows in a house plan
   */
  public int getNumWindows() {
    return numWindows;
  }

  /**
   * The getSquareFeet method returns the square footage defined in a specific
   * HousePlan
   * @return An int containing the square footage of a house
   */
  public int getSquareFeet() {
    return squareFeet;
  }

  /**
   * The toString method returns a String representation of a specific
   * HousePlan, including its square footage, number of rooms, number of
   * windows, materials used to build it, and features.
   * @return A string representation of a particular HousePlan
   */
  public String toString() {
    String ret = "";
    ret = ret + "Square Feet: " + this.getSquareFeet() + "\n";
    ret = ret + "Room: " + this.getNumRooms() + "\n";
    ret = ret + "Windows: " + this.getNumWindows() + "\n" + "\n";
    ret = ret + "Materials:\n";
  
    for (String material: materials) {
      ret = ret + " - " + material + "\n";
    }

    ret += "\n";
    ret += "Features: \n";

    for (String feature: features) {
      ret = ret + " - " + feature + "\n";
    }
    
    return ret;
  }

}
