import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceChallenge {

    public static void main(String[] args) {
        Player player = new Player("Anthony",50,100);
        System.out.println(player.toString());
        saveObject(player);
        player.setHitPoints(40);
        System.out.println(player);
        player.setWeapon("MassiveSword");
        saveObject(player);
        loadObject(player);
        System.out.println(player);

        Saveable monster = new Monster("RatOgre",1000,1000);
        System.out.println(monster);
        saveObject(monster);
    }

    public static void saveObject(Saveable save){

        for(int i=0; i<save.write().size(); i++){
            System.out.println("Saving current values " + save.write().get(i) + " to storage device");

        }
    }

    public static List<String> readValues(){
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+
                           "1 - To enter a string"+
                           "0 - To quit");
        while(!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String input = scanner.nextLine();
                    values.add(index,input);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void loadObject(Saveable load){
        List<String> values = readValues();
        load.read(values);
    }


}
