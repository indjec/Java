package com.cs09;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("330B", "Dell", "240V", dimensions);

        Monitor theMonitor = new Monitor("27 inches", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("43-2B", "Asus", 4, 5, "v2.55");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getTheMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
