import java.util.Objects;
import java.util.Scanner;

class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String ans;

    Question(int id, String question, String[] options, String ans){
        this.id = id;
        this.question = question;
        this.opt1 = options[0];
        this.opt2 = options[1];
        this.opt3 = options[2];
        this.opt4 = options[3];
        this.ans = ans;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public String getAns() {
        return ans;
    }
}

public class QuestionGame {
    public static int playQuiz(Question[] questions){
        int score = 0;
        for(Question ques: questions){
            System.out.printf("Id: %d\n", ques.getId());
            System.out.printf("Question: %s\n", ques.getQuestion());
            System.out.printf("Option 1: %s\n", ques.getOpt1());
            System.out.printf("Option 2: %s\n", ques.getOpt2());
            System.out.printf("Option 3: %s\n", ques.getOpt3());
            System.out.printf("Option 4: %s\n", ques.getOpt4());
            System.out.print("\nYour answer -> ");
            Scanner scn = new Scanner(System.in);
            System.out.println();
            String userAnswer = scn.next();
            String actualAnswer = ques.getAns();
            if (Objects.equals(userAnswer, actualAnswer)){
                score++;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Question[] questions = new Question[2];
        questions[0] = new Question(1, "2 + 2", new String[]{"2", "0", "4", "1"}, "3");
        questions[1] = new Question(2, "3 * 3", new String[]{"6", "9", "4", "3"}, "2");

        int userScore = playQuiz(questions);
        System.out.printf("User score: %d", userScore);
    }
}
