package ru.bonyachuk.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    // Factory method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing initialization Classical Music");
    }

    public void doMyDestroy() {
        System.out.println("Doing destruction Classical Music");
    }

    @Override
    public String getsong() {
        return "Hungarian Rhapsody";
    }
}
