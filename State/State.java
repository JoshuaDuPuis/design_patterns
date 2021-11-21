/**
 * The State interface defines methods that will be used in each of the three
 * classes defining the levels of the game. Each level will have a method to
 * get a number in a specified range, get an arithmetic operation, level up,
 * and level down.
 * @author Joshua DuPuis
 */
public interface State {
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
}
