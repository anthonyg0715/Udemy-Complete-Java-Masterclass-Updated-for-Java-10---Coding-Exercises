public class MegaBytesConverter {
    /*
    @author Anthony Garzon
    @Date 9/26/2018
     */
    //Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes
    //The method should not return anything and needs to calculate megabytes given kilobytes as the input
    //and calculate the remaining kilobytes as well
    //It needs to print in the format "XXKB = YYMB and ZZKB". Where XX represents the original kilobytes, YY represents
    //the calculated megabytes, and ZZ represents the remaining kilobytes.
    //Hints: Use the remainder operator to get the remaining kilobytes. 1mb = 1024kb.
    //First check if kilobytes is less than 0 and if it is then print invalid value.
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int result = kiloBytes / 1024;
            int finalResult = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + result + " MB " + "and " + finalResult + " KB");
        }

    }
}
