package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES_GAME);
    }

    public static String[] generateRound() {
        var number = Utils.generateRandomNumber();
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
