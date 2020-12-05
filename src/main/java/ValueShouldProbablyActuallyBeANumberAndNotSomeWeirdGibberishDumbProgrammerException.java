/**
 * Sometimes I ask myself what is wrong with me but I always get a {@code ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException} instead of an answer
 */
public class ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException extends Exception{
    @Override
    public void printStackTrace() {
        System.err.println("Holy fuck how can you be such a useless and dumb programmer wtf.");
        System.err.println("Maybe don't fucking enter something that is not even a number. And in the end you're going to blame it on the end user. Pathetic.");
        super.printStackTrace();
    }
}
