package com.cs09;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.monitor = theMonitor;
        this.motherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return monitor;
    }

    public Motherboard getTheMotherboard() {
        return motherboard;
    }
}
