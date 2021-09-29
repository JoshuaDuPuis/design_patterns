public class questionDriver {
    public static void main(String [] args) {
      Question q = new Question("What is my name?", "Josh", "Jim", "Joel", "Jeremy", 0);
      System.out.println(q);
      System.out.println(q.getCorrectAnswer());
      System.out.println(q.isCorrect(0));
      System.out.println(q.isCorrect(1));
    }
}
