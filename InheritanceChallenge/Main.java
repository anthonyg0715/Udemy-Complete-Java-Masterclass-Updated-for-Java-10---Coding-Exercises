/**
 * @author Anthony Garzon
 * @date 10/5/2018
 * @program Inheritance challenge
 * @description create a parent class vehicle then create a class car which extends vehicle and finally an actual car
 * class type that extends car. For each class create fields and methods which relate to that class such as speeding,
 * stopping, steering and so on.
 */
public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota(36);
        toyota.accelerate(2);
        toyota.steer(25);

    }
}
