package practice;

import java.util.Random;

public class LearnMath {

    public void randomMethod() {
        Random rand = new Random();

        //generate random integers
        int rand_int = rand.nextInt(1000);
        double rand_double = rand.nextDouble();

        System.out.println(rand_int);
        System.out.println(rand_double);
    }

    public void roundMethod() {
        double num1 = 14.49;
        System.out.println(Math.round(num1));
    }
}
