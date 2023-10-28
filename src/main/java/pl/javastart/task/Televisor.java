package pl.javastart.task;

public class Televisor {
    boolean isTurnedOn = false;

    void turnOn() {
        isTurnedOn = true;
    }

    void turnOff() {
        isTurnedOn = false;
    }

    void showStatus() {
        System.out.println("Czy telewizor jest włączony: " + isTurnedOn);
    }
}