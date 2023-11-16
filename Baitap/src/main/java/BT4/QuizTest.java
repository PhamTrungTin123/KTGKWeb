package BT4;
import BT4.Conclusion;
import BT4.Question;
import BT4.CareerTestData;

public class QuizTest {
	private Question[] questions;
	   private Conclusion[] conclusions;
	   private int currentQuestionIndex;
	   private int totalPoints;


	   public QuizTest() {
	      questions = CareerTestData.getQuestions();
	      conclusions = CareerTestData.getConclusions();
	   }


	   public Question getCurrentQuestion() {
	      return questions[currentQuestionIndex];
	   }


	   public int getCurrentQuestionIndex() {
	      return currentQuestionIndex;
	   }


	   public int getTotalPoints() {
	      return totalPoints;
	   }


	   public boolean hasMoreQuestions() {
	      return currentQuestionIndex < questions.length - 1;
	   }


	   public void nextQuestion() {
	      currentQuestionIndex++;
	   }


	   public void nextAction(int choose) {
	      totalPoints += getCurrentQuestion().getOptions()[choose].getPoint();
	   }


	   public void reset() {
	      totalPoints = 0;
	      currentQuestionIndex = 0;
	   }


	   public Conclusion getConclusionWhenDone() {
	      for (int i = 0; i < conclusions.length - 1; i++) {
	         if (totalPoints >= conclusions[i].getPointLevel()
	               && totalPoints < conclusions[i + 1].getPointLevel()) {
	            return conclusions[i];
	         }
	      }
	      return conclusions[conclusions.length - 1];
	   }

}
