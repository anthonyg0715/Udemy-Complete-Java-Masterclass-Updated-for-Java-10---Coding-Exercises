/**
 * @author Anthony Garzon
 * @date 10/7/2018
 * @Program Car
 * @description Create a base car class with appropriate fields such as number of wheels, engine, cylinders, and name. Then create
 * methods startEngine, accelerate, and brake all of type String saying what they are doing. Finally create subclasses
 * of well known car companies such as toyota, nissan, audi ect. and override the methods created in the base car class
 * for each subclass. When you override methods and then have them each do their own functionality here in the main that
 * is called runtime Polymorphism
 */
public class Main2 {
    public static void main(String[] args) {
        Car car = new Car(4,"Basic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car toyota = new Toyota(4,"Rav4");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Car nissan = new Nissan(6,"Centra");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());

        Car audi = new Audi(8,"Audi R8");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }
}
