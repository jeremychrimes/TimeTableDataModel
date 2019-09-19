package TimeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Subject { 
    public String name;
    public String shortname;
    public String teacher;
    public String colour;

    public static List<Subject> loadSubjects(String filename) throws FileNotFoundException {
        List<Subject> subjects = new ArrayList<Subject>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Subject s = new Subject(lineArray[0], lineArray[1], lineArray[2]);
            s.colour = "Violet";
            subjects.add(s);
        }
        sc.close();
        return subjects;
    }

    public Subject(String shortname, String name, String teacher, String colour) {
        this.name = name;
        this.shortname = shortname;
        this.teacher = teacher;
        this.colour = colour;
    }

    public Subject(String shortname, String name, String teacher) { 
        this.name = name;
        this.shortname = shortname;
        this.teacher = teacher;
    }
}