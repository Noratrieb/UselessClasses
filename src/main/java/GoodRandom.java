//codereview comment: "nice imports"
import Requests.OpenTDB;

import java.util.ArrayList;

/**
 * Generates random numbers based on OpenTDB trivia results. Should not be used too often. Should not be used actually.
 *
 * <p>
 *     Every trivia question has 4 answers, giving us a random number out of 4 for every question
 *     so now we just use the 4 as two binary digits and use them lol
 *     200IQ move, ik
 * </p>
 */
public class GoodRandom {

    OpenTDB trivia = new OpenTDB();

    /**
     * Create a new {@code GoodRandom} with a seed
     * @param seed The seed
     */
    public GoodRandom(int seed) {
        trivia.setCategory(seed % 20 + 10);
    }

    /**
     * Create a new {@code GoodRandom}
     */
    public GoodRandom() {
        this(0);
    }

    /**
     * Get a random integer from 0 to {@code max}. Integers are not distributed equally if {@code max} is not a power of 2.
     * @param max The maximum number
     * @return A random Integer from 0 to {@code max}
     */
    public int randomInt(int max){
        return randomInt(0, max);
    }

    /**
     * Get a random integer from {@code min} to {@code max}. Integers are not distributed equally if {@code max} - {@code min} is not a power of 2.
     * @param min The minimum number
     * @param max The maximum number
     * @return A random Integer from 0 to {@code max}
     */
    public int randomInt(int min, int max){
        int range = max - min;
        //exponent of next biggest power of two
        int digits = (int) Math.ceil(Math.log(range)/Math.log(2));
        //how many times we need a digit from 0-3
        int twoDigits = (int) Math.ceil(digits / 2d);
        int resultNumber = 0;
        //add the random number from 0-3 but shift it 2 bits to the left everytime
        for (int i = 0; i < twoDigits; i++) {
            resultNumber += Math.pow(4, i) * getFourDigit();
        }
        //normalize it, will lead to unbalanced results but das interessiert mich nicht
        int resultNormalized = resultNumber % range;
        return resultNormalized + min;
    }

    /**
     * Get a random number from 0 to 3 using OpenTDB. It pulls a random trivia question,
     * sorts the answers alphabetically and returns the position of the correct answer
     * @return A random number from 0 to 3
     */
    private int getFourDigit(){
        trivia.getTrivia();
        ArrayList<String> answers = new ArrayList<>();
        String[] inc = trivia.getIncorrectAnswers();
        String cor = trivia.getCorrectAnswer();
        answers.add(cor);
        answers.add(inc[0]);
        answers.add(inc[1]);
        answers.add(inc[2]);
        answers.sort(null);
        return answers.indexOf(cor);
    }
}