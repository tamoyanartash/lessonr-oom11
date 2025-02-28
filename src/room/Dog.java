package room;

public class Dog extends Animal {
public String intelligence;
public String  loyalty;

    @Override
    public String toString() {
        return "Dog{" +
                "intelligence='" + intelligence + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", breed='" + breed + '\'' +
                ", order='" + order + '\'' +
                ", age=" + age +
                '}';
    }
}

