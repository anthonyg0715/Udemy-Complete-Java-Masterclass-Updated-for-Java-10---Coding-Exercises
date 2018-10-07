public class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Engine started for toyota";
    }

    @Override
    public String accelerate() {
        return "Toyota accelerated";
    }

    @Override
    public String brake() {
        return "Toyota stopped!";
    }
}
