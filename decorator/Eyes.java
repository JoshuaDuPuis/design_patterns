package decorator;

/**
 * The Eyes class adds eyes to the character passed in through the constructor.
 * @author Joshua DuPuis
 */
public class Eyes extends CharacterDecorator {

  /**
   * The Eyes constructor calls the constructor of the parent class, copying
   * the values from the Character's arrayList to an arrayList of its own.
   * @param character The character passed in to add eyes to
   */
  public Eyes (Character character) {
    super(character);
    this.customize();
  }

  /**
   * The customize method adds eyes to the fourth element of the sections 
   * ArrayList.
   */
  public void customize() {
    this.sections.set(3, " |  o  o  |");
  }
}