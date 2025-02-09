package room;

public class Computer {
    private String name;
    private String color;
    private int year;
    private double Ram;
    private String design;


    public void printinfo() {
        System.out.println("name:" + name);
        System.out.println("color:" + color);
        System.out.println("Ram:" + Ram);
        System.out.println("design:" + design);
    }
}