package decorator;

/**
 * The Hat class adds a hat to the character passed in through the constructor.
 * @author Joshua DuPuis
 */
public class Hat extends CharacterDecorator {

  /**
   * The Hat constructor calls the constructor of the parent class, copying
   * the values from the Character's arrayList to an arrayList of its own.
   * @param character The character passed in to add a hat to
   */
    public Hat (Character character) {
      super(character);
      this.customize();
    }

  /**
   * The customize method changes the second element of the sections ArrayList
   * to add a hat to the character.
   */
  public void customize() {
    this.sections.set(1, " __|____|____");
  }
}