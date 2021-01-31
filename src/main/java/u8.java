/**
 * An unsigned byte.
 * Unlike other programming languages like C, C++ and many others, Java is too high-level to
 * bother with having or not having sign bits. It just has them by default.
 * <p>
 * This creates a problem,
 * because sometimes you might want to save memory and use unsigned bytes.
 * In this case, this class is perfect for you because it does exactly that.
 * (The 'exactly that' refers to 'creates a problem')
 */
public class u8 {

    private final byte b;

    /**
     * Create a new u8. You need to input a short because that is how Java works.
     * The value will be stored in a byte though.
     * @param s
     */
    public u8(short s) {
        b = (byte) s;
    }

    /**
     * Get the value back.
     * @return The value as a short because that is how Java works.
     */
    public short val(){
        return b;
    }
}
