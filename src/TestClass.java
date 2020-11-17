public class TestClass {

    public static void main(String[] args) {
        StringOfChars s = new StringOfChars('h', 'a');
        s.append(new StringOfChars('l', 'l', 'o'));
        System.out.println(s.toString());
    }
}
