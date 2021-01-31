public class TestClass {

    public static void main(String[] args) {

        u8 myByte = new u8((short) 127);
        System.out.println(myByte.val());

        //max array size for u8: 2'050'000'000 - 2'100'000'000
        //max array size for byte: 7'500'000'000 - 10'000'000'000
        //max array size for short: 3'700'000'000 - 4'500'000'000

        u8[][][] test = new u8[1000][1000][1000];
        System.out.printf("no error for size: %,d", (long) test.length * (long) test[0].length * (long) test[0][0].length);


        /*StringOfChars s = new StringOfChars('h', 'a');
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

        GoodRandom random = new GoodRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.randomInt(20));
        }*/
    }
}