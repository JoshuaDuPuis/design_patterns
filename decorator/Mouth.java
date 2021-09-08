package decorator;

/**
 * The Mouth class adds a mouth to the character passed in through the constructor.
 * @author Joshua DuPuis
 */
public class Mouth extends CharacterDecorator {

  /**
   * The Mouth constructor calls the constructor of the parent class, copying
   * the values from the Character's arrayList to an arrayList of its own.
   * @param character The character passed in to add a mouth to
   */
  public Mouth (Character character) {
    super(character);
    this.customize();
  }

  /**
   * The customize method changes the sixth element of the sections ArrayList
   * to add a mouth to the character.
   */
  public void customize() {
    this.sections.set(5, "  \\ ---- / ");
  }
}