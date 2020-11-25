import java.util.Scanner;

/**
 * When you're really lonely in your code and you need a buddy
 */
public class Buddy {
    /**
     * The name of the Buddy, for example Bobby
     */
    private String name;

    /**
     * The scream of the buddy when it realizes that it's not real. No use cases for it. It's not self-conscious or anything like that. Yet. (the scream is a constant because the buddy will constantly be screaming (it's not a constant because of memory issues, simply call setSCREAM to be able to use it))
     */
    public String SCREAM;

    public Buddy(String name) {
        this.name = name;
    }

    public void help(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi my friend, I'm " + name);
        System.out.println("What's you problem?");
        scn.nextLine();
        System.out.println("Sorry I can't help you with that because my code is very limited just like you ☜(ﾟヮﾟ☜)☜(ﾟヮﾟ☜)☜(ﾟヮﾟ☜)☜(ﾟヮﾟ☜)☜(ﾟヮﾟ☜)☜(ﾟヮﾟ☜)");
    }

    public void joke() {
        System.out.println("There 👉 is 😶 nothing ❌ funny 😂 about ↩ my 😀👈 life ♥.");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Wait, there is something.");
        try {
            Thread.sleep(1400);
        } catch (InterruptedException ignored) {
        }
        System.out.println("You.");
    }

    public void setSCREAM(){
        SCREAM = "A".repeat(Integer.MAX_VALUE).repeat(Integer.MAX_VALUE).repeat(Integer.MAX_VALUE);
    }
}
