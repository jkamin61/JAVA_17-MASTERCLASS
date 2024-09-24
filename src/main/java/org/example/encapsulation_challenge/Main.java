package org.example.encapsulation_challenge;

public class Main {
    public static void main(String[] args) {
        Printer hallroomPrinter = new Printer(85, false);
        hallroomPrinter.addToner(5);
        System.out.printf("Toner level: %d\n", hallroomPrinter.getTonerLevel());
        System.out.println("Turning on duplex mode..");
        hallroomPrinter.changeDuplexMode(true);
        hallroomPrinter.printPages(48);
        System.out.printf("Pages already printed in overall: %d", hallroomPrinter.getPagesPrinted());
    }
}
