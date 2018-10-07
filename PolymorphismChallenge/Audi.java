public class Audi extends Car{

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi started";
    }

    @Override
    public String accelerate() {
        return "Audi accelerated";
    }

    @Override
    public String brake() {
        return "Audi stopped!";
    }
}
