package decorator;

/**
 * The PotatoeHead class defines a PotatoeHead object and initializes the
 * ArrayList of sections that the user can add on to.
 * @author Joshua DuPuis
 */
public class PotatoeHead extends Character {

  /**
   * The PotatoeHead constructor constructs a PotatoeHead object
   */
  public PotatoeHead() {
    this.sections.add("    ____");
    this.sections.add("   /    \\");
    this.sections.add("  /      \\");
    this.sections.add(" |        |");
    this.sections.add(" |        |");
    this.sections.add("  \\      /");
    this.sections.add("   \\____/");


  }
}