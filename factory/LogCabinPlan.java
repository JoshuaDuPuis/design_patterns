
/**
  * Log Cabin Plan class extends the HousePlan class and creates a
  * log cabin and specifies the materials used to build it as well as the
  * features used to design it.  
  * @author Joshua DuPuis
  */
public class LogCabinPlan extends HousePlan{

  /**
   * The LogCabinPlan constructor creates a LogCabin style house object and
   * calls the super class constructor to set its attributes
   */
  public LogCabinPlan() {
    super(2, 10, 1800);
  }

  /**
   * The setMaterials method sets the materials needed to build a log cabin.
   */
  protected void setMaterials() {
    super.materials.add("Log Siding");
    super.materials.add("Board and Batten Siding");
    super.materials.add("White Pine");
  }

  /**
   * The setFeatures method defines the features desired in a log cabin.
   */
  protected void setFeatures() {
    super.features.add("Timbered Roof");
    super.features.add("High Insulation");
    super.features.add("Rustic Effect");
  }

  /**
   * The toString method returns a String representation of a log cabin,
   * including its features, materials, and attributes.
   */
  public String toString() {
    return "Log Cabin\n" + super.toString();
  }
}
