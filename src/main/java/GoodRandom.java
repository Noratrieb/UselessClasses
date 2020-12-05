import Requests.OpenTDB;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generates random numbers based on OpenTDB trivia results. Should not be used too often. Should not be used actually.
 *
 * <p>
 *     Every trivia question has 4 answers, giving us a random number out of 4 for every question
 *     2 question can give an octal digit, which can be converted to an int
 *     200IQ move, ik
 * </p>
 */
public class GoodRandom {

    OpenTDB trivia = new OpenTDB();

    public GoodRandom(int seed) {
        trivia.setCategory(seed % 20 + 10);
    }

    public GoodRandom() {
        this(0);
    }

    public int randomInt(int max){
        return randomInt(0, max);
    }

    public int randomInt(int min, int max){
        int range = max - min;
        //exponent of next biggest power of two
        int digits = (int) Math.ceil(Math.log(range)/Math.log(2));
        int twoDigits = (int) Math.ceil(digits / 2d);
        int resultNumber = 0;
        for (int i = 0; i < twoDigits; i++) {
            resultNumber += Math.pow(4, i) * getFourDigit();
        }
        int resultNormalized = resultNumber % range;
        return resultNormalized + min;
    }

    private int getFourDigit(){
        trivia.getTrivia();
        ArrayList<String> answers = new ArrayList<>();
        answers.add(trivia.getCorrectAnswer());
        answers.add(trivia.getIncorrectAnswers()[0]);
        answers.add(trivia.getIncorrectAnswers()[1]);
        answers.add(trivia.getIncorrectAnswers()[2]);
        answers.sort(null);
        return answers.indexOf(trivia.getCorrectAnswer());
    }
}