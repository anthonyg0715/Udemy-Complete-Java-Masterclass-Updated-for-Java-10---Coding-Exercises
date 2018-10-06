/**
 * @author Anthony Garzon
 * @date 10/6/2018
 * @program MasterBedroom
 * @description Here we are creating code using composition over inheritance and it is pretty much creating instances of
 * classes in other classes instead of having them dependent on a parent class 
 */
public class Main {

    public static void main(String[] args) {

        MasterBedroom mb = new MasterBedroom(new Bed(100), new Closet(500), new Bathroom(600));
        mb.getBathroomSize();
        mb.getBedSize();
        mb.getClosetSize();
    }
}
