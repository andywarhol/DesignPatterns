package SRP;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    //Single Responsibility Principle states that every class, method or function should have
    //only one job or one reason to change.

    //SRP forces you to put only one responsibility into any class or method.
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String entry) {
        entries.add("" + (++count) + ": " + entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(), entries);
    }

}
