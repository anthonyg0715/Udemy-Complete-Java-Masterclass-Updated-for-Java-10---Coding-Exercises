public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String name, int wheels, int doors, int gears, boolean isManual) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear is " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Cars velocity is " + speed + " Cars direction is " + direction);
    }

}
