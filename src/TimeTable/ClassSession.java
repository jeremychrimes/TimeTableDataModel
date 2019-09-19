package TimeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class ClassSession { 
    Subject subject;
    Period period;
    WeekDay day;
    
    public static List<ClassSession> loadClasses(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        List<ClassSession> classes = new ArrayList<ClassSession>();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(",");

            ClassSession session = new ClassSession();
            session.day = WeekDay.fromString(lineArray[0]);
            Integer intPNum = Integer.valueOf(lineArray[1]);
            Optional<Period> a = TimeTable.datastore.periods.stream().filter(p -> p.periodNumber == intPNum).findFirst();
            // System.out.println(TimeTable.datastore.periods.size());
            if (a.isPresent()) {
                session.period = a.get();
            }
            String tempSubjectName = lineArray[2];
            Optional<Subject> s = TimeTable.datastore.subjects.stream().filter(x -> x.shortname.matches(tempSubjectName)).findFirst();
            if (s.isPresent()) {
                session.subject= s.get();
            }
            classes.add(session);
        }
        return classes;
    }
    public ClassSession() {
    }
    public ClassSession(Subject subject, Period period, WeekDay day) {
        this.subject = subject;
        this.period = period;
        this.day = day;
    }

    public String getSummary() {
        String name = this.subject.name;
        String teacher = this.subject.teacher;
        String startTime = this.period.startTime.toString();
        String endTime = this.period.endTime.toString();
        String returnValue = String.join(", ", name, teacher, startTime, endTime);
        return returnValue;
    }
}