
/**
  * The ContemporaryPlan class extends the HousePlan class and creates a
  * contemporary-style home and specifies the materials used to build it as 
  * well as the features used to design it. 
  * @author Joshua DuPuis
  */
public class ContemporaryPlan extends HousePlan {
    
  /**
   * The ContemporaryPlan constructor creates a ContempraryPlan style house
   * object and calls the super class constructor to set the house attributes.
   */
  public ContemporaryPlan() {
    super(5, 40, 3000);
  }

  /**
   * The setMaterials method sets the materials needed to build a contemporary-
   * style home.
   */
  protected void setMaterials() {
    super.materials.add("Ceramics");
    super.materials.add("High-Strength Alloys");
    super.materials.add("Composites");
  }

  /**
   * The setFeatures method defines the features desired in a contemporary-
   * style home.
   */
  protected void setFeatures() {
    super.features.add("Oversided Windows");
    super.features.add("Unconventional Roofs");
    super.features.add("Minimalism");
    super.features.add("Open Floor Plan");
  }

  /**
   * The toString method returns a String representation of a contemporary-
   * style home, including its features, materials, and attributes.
   */
  public String toString() {
    return "Contemporary Home\n" + super.toString();
  }
}
