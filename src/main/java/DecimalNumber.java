/**
 * While being a very useful class, SingedInteger has a very big problem. It can't store decimal numbers.
 * That's why this class exists.
 */
public class DecimalNumber {

    long integerPart;
    long decimalPart;

    /**
     * Create a new DecimalNumber from a d**ble
     * A double, you ask? Shut the fuck up, I say.
     * @param n The d**ble
     */
    public DecimalNumber(double n){
            String s = String.valueOf(n);
            String[] ss = s.split("\\.");
            System.out.println(ss[0]);
            System.out.println(ss[1]);
            integerPart = Long.parseLong(ss[0]);
            decimalPart = Long.parseLong(ss[1]);
    }

    /**
     * Create a new DecimalNumber directly from a String. No more stupid parsing, just stupid exceptions!
     * @param s the thing with funny chars I forgot the name it was something long and thin
     * @throws ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException yeah it does actually throw that good luck catching it
     */
    public DecimalNumber(String s) throws ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException {
        try {
            String[] ss = s.split("\\.");
            System.out.println(ss[0]);
            System.out.println(ss[1]);
            integerPart = Long.parseLong(ss[0]);
            decimalPart = Long.parseLong(ss[1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            throw new ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException();
        }
    }

    /**
     * Get the value as a d**ble
     * @return The value as a d**ble
     */
    public double getValue(){
        return Double.parseDouble(integerPart + "." + decimalPart);
    }
}
