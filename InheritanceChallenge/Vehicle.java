public class Vehicle {

    private String name;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Steering at current direction: " + this.currentDirection);
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Moving at velocity: " + this.currentVelocity + " moving at direction: " + this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
        System.out.println("Car stopped!");
    }
}
