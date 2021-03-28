package practice;

public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String displayInformation() {
        return (String.format("No of gears: %d speed of bicycle is: %d", gear, speed));
    }
}
