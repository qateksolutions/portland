package practice;

public class MountainBike extends Bicycle{
    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int height) {
        seatHeight = height;
    }

    @Override
    public String displayInformation() {
        return (String.format("%s seat height is: %d", super.displayInformation(), seatHeight));
    }
}
