package room;

public class Eagle extends  Animal {
    public String vision;

    @Override
    public String toString() {
        return "Eagle{" +
                "vision='" + vision + '\'' +
                ", breed='" + breed + '\'' +
                ", order='" + order + '\'' +
                ", age=" + age +
                '}';
    }
}
