package room;

public class Bear extends Animal{
    String power;

    @Override
    public String toString() {
        return "Bear{" +
                "power='" + power + '\'' +
                ", breed='" + breed + '\'' +
                ", order='" + order + '\'' +
                ", age=" + age +
                '}';
    }
}
