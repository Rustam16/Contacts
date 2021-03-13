package space.example.contacts;

public class Person {
    private int number;
    private String name;
    private static int nextId = 1;

    public Person(int number, String name, int nextId) {
        this.number = number;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

}
