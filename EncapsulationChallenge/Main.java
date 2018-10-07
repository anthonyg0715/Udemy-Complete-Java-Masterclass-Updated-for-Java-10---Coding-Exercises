public class Main {
    public static void main(String[] args) {

//        EnhancedPlayer newPlayer = new EnhancedPlayer(29,"Anthony","Sword");
//        System.out.println("Current health is: " + newPlayer.getHealth());

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count: " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed: " + pagesPrinted + " new total count for pages printed is " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed: " + pagesPrinted + " new total count for pages printed is " + printer.getNumberOfPagesPrinted());
    }
}
