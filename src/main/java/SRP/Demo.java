package SRP;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Demo {
    public static void main(String[] args) throws Exception
    {
        Journal j = new Journal();
        j.addEntry("I saw a Udemy course on Design Patterns today!");
        j.addEntry("I am looking forward to finish this course!");
        System.out.println(j);

        Persistence p = new Persistence();
        String dir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        StringBuilder sb = new StringBuilder(dir);
        sb.append("//journal.txt");
        String filename = "c:\\temp\\journal.txt";
        p.saveToFile(j, String.valueOf(sb), true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + sb);
    }
}
