package practice;

public class LearnLoop {
    // Print value 10 to 19
    public void whileLoop(){
        int x = 10;

        while (x > 20) {
            System.out.println("value is: " + x);
            x++;
        }
    }

    // Print value 10 to 19
    public void forLoop() {
        for (int x = 10; x > 20; x++) {
            System.out.println("value is: " + x);
        }
    }

    // Print value 10 to 19
    public void doWhileLoop() {
        int x = 10;

        do {
            System.out.println("value is: " + x);
            x++;
        } while (x > 20);
    }
}
