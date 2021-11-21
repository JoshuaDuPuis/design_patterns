import java.lang.Math;
/**
 * The Easy class defines the easy level of the trivia game.
 * @author Joshua DuPuis
 */

 public class Easy implements State{

    private ArithemeticGame game;

    /**
     * The Easy constructor constructs the easy level of the game
     * @param game The trivia game being played
     */
    public Easy(ArithemeticGame game) {
      this.game = game;
    }

    /**
     * The getNum method returns a number between one and ten
     * @return An int between one and ten
     */
    public int getNum() {
      int num = (int)((Math.random()*10)+1);
      return num;
    }

    /**
     * The getOperation method randomly returns either "+" or "-"
     * @return A String contianing either "+" or "-"
     */
    public String getOperation() {
      int num = (int)(Math.random()*2);
      if (num == 0) {
         return "+";
      }
      return "-";
    }

    /**
     * The levelUp method moves the game to the medium state and prints out
     * an encouraging message.
     */
    public void levelUp() {
      System.out.println("You've been advanced to the medium mode.");
      game.setState(game.getMediumState());
    }

    /**
     * The levelDown method displays a message to the user informaing them they
     * are not doing well.
     */
    public void levelDown() {
      System.out.println("You seem to be struggling, you may want to study");
    }

 }