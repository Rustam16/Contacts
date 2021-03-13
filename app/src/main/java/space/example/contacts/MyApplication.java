package space.example.contacts;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {
    private static List<Person> personList = new ArrayList<>();
    private static int nextId = 1;

    public MyApplication() {
        fillPersonList();
    }

    private void fillPersonList() {
        Person p0 = new Person(703337705, "LIsa", 1);
        Person p1 = new Person(7858758, "Aibek", 2);
        Person p2 = new Person(70337705, "Lisa", 3);
        Person p3 = new Person(703737705, "Nikname", 4);
        Person p4 = new Person(703337705, "Beka", 5);
        Person p5 = new Person(3337705, "Joni", 6);
        personList.addAll(Arrays.asList(p0, p1, p2, p3, p4, p5));
    }

    public static List<Person> getPersonList() {
        return personList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
