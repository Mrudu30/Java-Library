import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private ArrayList<Question> rightQuestions;
    private ArrayList<Question> wrongQuestions;

    public Quiz(String filename) {
        questions = new ArrayList<>();
        score = 0;
        rightQuestions = new ArrayList<>();
        wrongQuestions = new ArrayList<>();
        loadQuestions(filename);
    }

    private void loadQuestions(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String question = fileScanner.nextLine();
                String[] options = new String[4];
                for (int i = 0; i < 4; i++) {
                    options[i] = fileScanner.nextLine();
                }
                char correctAnswer = fileScanner.nextLine().charAt(0);
                questions.add(new Question(question, options, correctAnswer));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Questions file not found.");
            e.printStackTrace();
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        for (Question q : questions) {
            System.out.println(q.getQuestion());
            for (String option : q.getOptions()) {
                System.out.println(option);
            }

            char answer;
            while (true) {
                System.out.print("Your answer: ");
                answer = scanner.next().charAt(0);
                if (answer >= 'a' && answer <= 'd') {
                    break;
                } else {
                    System.out.println("Invalid option. Please choose a valid option (a, b, c, or d).");
                }
            }

            if (q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
                rightQuestions.add(q);
            } else {
                System.out.println("Incorrect. The correct answer is: " + q.getCorrectAnswer() + "\n");
                wrongQuestions.add(q);
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;  // Convert to seconds

        System.out.println("Your final score is: " + score + "/" + questions.size());
        System.out.println("Total time taken: " + totalTime + " seconds");
        System.out.println("Right answers: " + rightQuestions.size());
        System.out.println("Wrong answers: " + wrongQuestions.size());

        if (!wrongQuestions.isEmpty()) {
            System.out.println("Review of wrong answers:");
            for (Question q : wrongQuestions) {
                System.out.println(q.getQuestion());
                System.out.println("Correct answer: " + q.getCorrectAnswer());
            }
        }
    }
}
