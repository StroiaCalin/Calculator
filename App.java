package org.example;

public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
//  Participant m = new Participant("", 0);
        View v = new View("Calculator");
        Controller c = new Controller(v);
        c.initController();
    }
}