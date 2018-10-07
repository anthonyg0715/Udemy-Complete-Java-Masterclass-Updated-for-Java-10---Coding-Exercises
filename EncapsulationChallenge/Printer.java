/**
 * @author Anthony Garzon
 * @date 10/6/2018
 * @program Printer
 * @Description Using encapsulation while creating a class called Printer to simulate a real life printer where encapsulation
 * properly protects our fields and methods  
 */
public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(this.tonerLevel > -1 && this.tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.numberOfPagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int fillToner(int fill){
        if(fill > 0 && fill <= 100){
            if(this.tonerLevel + fill > 100){return -1;}
            this.tonerLevel += fill;
            return this.tonerLevel;
        }else{
            return -1;//attempting to add toner to printer but you are outside of range
        }
    }

    public int printPages(int print){
        int pagesToPrint = print;
        if(this.isDuplexPrinter){
            pagesToPrint  = (print/2) + (print % 2);//we can print on both sides
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
