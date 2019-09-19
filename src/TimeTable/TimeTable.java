package TimeTable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class TimeTable {
    public List<Period> periods;
    public List<Subject> subjects = new ArrayList<Subject>();
    public List<ClassSession> classes = new ArrayList<ClassSession>();
    public static TimeTable datastore;
    
    public TimeTable(String periodfile, String subjectsfile) throws Exception {
        periods = Period.loadPeriods(periodfile);
        subjects = Subject.loadSubjects(subjectsfile);
        
    }
    public static List<ClassSession> getClassesByDay(WeekDay day) {
        List<ClassSession> classes = new ArrayList<ClassSession>();
        datastore.classes.stream().filter(c -> c.day == day).forEach(c -> classes.add(c));
        return classes;
    }

    public static List<ClassSession> getClassesBySubject (Subject subject) {
        List<ClassSession> classes = new ArrayList<ClassSession>();
        datastore.classes.stream().filter(c -> c.subject == subject).forEach(c -> classes.add(c));
        return classes;
    };
	public static void main(String[] args) throws Exception {
        WeekDay m = WeekDay.Monday;
        datastore = new TimeTable("./periods.csv", "./subjects.csv");
        // Load the classes into the data store due to async issues in java this needs to be done after init.
        datastore.classes = ClassSession.loadClasses("./classes.csv");
        for(Subject subject : TimeTable.datastore.subjects) {
            System.out.println(subject.name);
            List<ClassSession> classes = getClassesBySubject(subject);
            for (ClassSession classsesh : classes) {
                System.out.println(classsesh.day);
            }
        }
    }
}