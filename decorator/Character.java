package decorator;

import java.util.ArrayList;

/**
 * The Character class builds a character by initailizing an ArrayList
 * that will contain strings to draw the character. The strings in the
 * ArrayList will be defined by child classes that inherit the abstract class.
 * @author Joshua DuPuis
 */
public abstract class Character {
  protected ArrayList<String> sections;

  /**
   * The Character constructor initializes the ArrayList that will contain
   * Strings to draw the character.
   */
  public Character() {
    sections = new ArrayList<String>();
  }

  /**
   * The draw method prints out each element in the ArrayList, drawing the
   * specific character.
   */
  public void draw() {
    for (String body: sections) {
        System.out.println(body);
    }
  }
}