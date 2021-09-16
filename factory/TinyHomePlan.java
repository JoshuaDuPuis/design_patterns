
/**
  * The TinyHomePlan class extends the HousePlan class and creates a
  * tiny home and specifies the materials used to build it as well as the
  * features used to design it. 
  * @author Joshua DuPuis
  */
public class TinyHomePlan extends HousePlan{
  
  /**
   * The TinyHomePlan constructor creates a TinyHome style house
   * object and calls the super class constructor to set the house attributes.
   */
  public TinyHomePlan(){
    super(1, 5, 200);
  }

  /**
   * The setMaterials method sets the materials needed to build a tiny home.
   */
  protected void setMaterials() {
    super.materials.add("Lumber");
    super.materials.add("Insulation");
    super.materials.add("Metal Roofing");
    super.materials.add("Hardware");
  }

  /**
   * The setFeatures method defines the features desired in a tiny home.
   */
  protected void setFeatures() {
    super.features.add("Natural Light");
    super.features.add("Creative Storage");
    super.features.add("Multipurpose areas");
    super.features.add("Multi-use applications");
  }

  /**
   * The toString method returns a String representation of a tiny home,
   * including its features, materials, and attributes
   */
  public String toString() {
    return "Tiny House\n" + super.toString();
  }
}
