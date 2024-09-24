package org.example.encapsulation_challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerAmount < 0 || tonerAmount > 100) {
            System.out.println("Wrong value for tonerAmount. Stay in range 1 - 100");
            return -1;
        }
        return tonerLevel;
    }

    public void changeDuplexMode(boolean mode) {
        duplex = mode;
        System.out.println("Duplex " + (mode ? "ON" : "OFF"));
    }

    public int printPages(int pages) {
        System.out.println(duplex ? "Printing duplex sites *duplex on*" : "Printing single sites *duplex off*");
        int pagesToBePrinted = duplex ? pages / 2 + (pages % 2) : pages;
        pagesPrinted += pagesToBePrinted;
        return pagesToBePrinted;
    }
}
