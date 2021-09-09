package decorator;

/**
 * The Nose class adds a nose to the character passed in through the constructor.
 * @author Joshua DuPuis
 */
public class Nose extends CharacterDecorator {

  /**
   * The Nose constructor calls the constructor of the parent class, copying
   * the values from the Character's arrayList to an arrayList of its own.
   * @param character The character passed in to add a nose to
   */
  public Nose (Character character) {
    super(character);
    this.customize();
  }

  /**
   * The customize method changes the fifth element of the sections ArrayList
   * to add a nose to the character.
   */
  public void customize() {
    this.sections.set(4, " |   >    | "); 
  }
}