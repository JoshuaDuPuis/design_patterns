/**
 * The Question class creates a Question object and determines which answer
 * is correct.
 * @author Joshua DuPuis 
 */
public class Question {
  private String question;
  private String[] answers;
  private int correctAnswer;

  /**
   * The Question constructor initializes a Question object, initializing and
   * filling the array of answers with those input by the user and setting the
   * correctAnswer instance variable to the correct value.
   * @param question The trivia question to be asked
   * @param ans1 The first possible answer to the question
   * @param ans2 The second possible answer to the question
   * @param ans3 The third possible answer to the question
   * @param ans4 The fourth possible answer to the question
   * @param correctAnswer The int containing the number of the correct answer
   */
  public Question(String question, String ans1, String ans2, String ans3, String ans4,
      int correctAnswer) {
    this.question = question;
    this.answers = new String[4];
    this.answers[0] = ans1;
    this.answers[1] = ans2;
    this.answers[2] = ans3;
    this.answers[3] = ans4;
    this.correctAnswer = correctAnswer;
  }

  /**
   * The toString method returns a string representation of the question and
   * its answers.
   * @return A string representation of the question
   */
  public String toString() {
    String ret = question + "\n";
    ret += "1. " + answers[0] + "\n";
    ret += "2. " + answers[1] + "\n";
    ret += "3. " + answers[2] + "\n";
    ret += "4. " + answers[3] + "\n";
    return ret;
  }

  /**
   * The isCorrect method checks to see if a user's input matches the correct
   * answer to a question.
   * @param userAnswer The answer to the question the user believes is correct 
   * @return Returns true if the user's guess is correct, false if not
   */
  public boolean isCorrect(int userAnswer) {
    if ((userAnswer-1) == this.correctAnswer) {
        return true;
    }
    return false;
  }

  /**
   * The getCorrectAnswer method returns a string of the correct answer
   * @return A string containing the correct answer to a question
   */
  public String getCorrectAnswer() {
    return this.answers[correctAnswer];
  }
}
