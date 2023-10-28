package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Televisor tv1 = new Televisor();
        tv1.showStatus();

        System.out.println("Włączam telewizor");
        tv1.turnOn();
        tv1.showStatus();

        System.out.println("Wyłączam telewizor");
        tv1.turnOff();
        tv1.showStatus();

    }
}