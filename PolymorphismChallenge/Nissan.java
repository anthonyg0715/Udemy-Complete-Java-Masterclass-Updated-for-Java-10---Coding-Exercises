public class Nissan extends Car{

    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Nissan started";
    }

    @Override
    public String accelerate() {
        return "Nissan accelerated";
    }

    @Override
    public String brake() {
        return "Nissan stopped!";
    }
}
