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
