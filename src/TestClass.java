public class TestClass {

    public static void main(String[] args) {
        StringOfChars s = new StringOfChars('h', 'a');
        s.append('l', 'l', 'o');
        System.out.println(s.toString());

        DecimalNumber dd = new DecimalNumber(2.4);
        try{
            DecimalNumber d = new DecimalNumber("hurensohn");
        } catch (ValueShouldProbablyActuallyBeANumberAndNotSomeWeirdGibberishDumbProgrammerException e) {
            e.printStackTrace();
        }

        Buddy bobby = new Buddy("bobby");
        bobby.help();
        bobby.joke();
    }
}