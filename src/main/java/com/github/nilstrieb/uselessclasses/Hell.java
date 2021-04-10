/**
 * This class tries to create a huge array of longs (1e+22 in total)
 * This obviously causes an {@code OutOfMemoryError}
 *
 * And while the docs of {@code Error} say that an Error shows "problems that a reasonable application
 * should not try to catch", nothing is actually stopping us from doing it.
 *
 * Welcome to Hell.
 */
public class Hell {

    public static void main(String[] args) {

        boolean success = false;

        while (!success) {
            try {
                var y = new long[100][100][100][100][100][100][100][100][100][100][100];
                success = true;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            System.out.println("creation of massive long array failed. trying again...");
        }

        System.out.println("Sucess!");
    }
}
