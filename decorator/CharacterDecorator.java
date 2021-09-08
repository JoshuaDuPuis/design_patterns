package decorator;

import java.util.ArrayList;

/**
 * The CharacterDecorator class is a child of the character class and creates a
 * copy of the ArrayList of the Character passed into the constructor so that
 * the character passed in can add features.
 * @author Joshua DuPuis
 */
public abstract class CharacterDecorator extends Character{
protected Character character;

/**
 * The CharacterDecorator constructor initializes the sections ArrayList of
 * a CharacterDecorator object and copies the values of the sections ArrayList
 * of the Character passed in to the constructor to the sections ArrayList of
 * the CharacterDecorator
 * @param character The Character object from which the sections ArrayList will
 * be copied
 */
public CharacterDecorator(Character character) {
  this.sections = new ArrayList<String>();
  for (String line: character.sections) {
      this.sections.add(line);
  }
}

/**
 * The customize method is an abstract method that will allow the children of
 * the CharacterDecorator class to add their specific element to the sections
 * ArrayList.
 */
public abstract void customize();

}