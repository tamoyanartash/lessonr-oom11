package room;

public class Cat extends Animal{
   public String hunting;

    @Override
    public String toString() {
        return "Cat{" +
                "hunting='" + hunting + '\'' +
                ", breed='" + breed + '\'' +
                ", order='" + order + '\'' +
                ", age=" + age +
                '}';
    }
}
