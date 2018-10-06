public class MasterBedroom {

    private Bed bed;
    private Closet closet;
    private Bathroom bathroom;

    public MasterBedroom(Bed bed, Closet closet, Bathroom bathroom) {
        System.out.println("Sizes for the bed closet and bathroom in the master bedroom are");
        this.bed = bed;
        this.closet = closet;
        this.bathroom = bathroom;
    }

    public void getBedSize(){
        System.out.println("Bed size: " + bed.getSize());

    }

    public void getBathroomSize(){
        System.out.println("Bathroom size: " + bathroom.getSize());
    }

    public void getClosetSize(){
        System.out.println("Closet size: " + closet.getSize());
    }

}
