package TimeTable;

import TimeTable.models.Subject;
import TimeTable.plugins.ObjectTimetableStore;
import TimeTable.stores.TimeTableStore;

import java.util.ArrayList;

public class TimeTableFactory {
    public static TimeTable createTimeTable() {
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        Subject subject = new Subject("Further Mats", "FMA", "Read");
        subjects.add(subject);
        TimeTableStore store = new ObjectTimetableStore(null, null, subjects);

        TimeTable timeTable = new TimeTableContext(store).getTimeTable();

        timeTable.getSubjectProvider().getSubjects().forEach(subject1 -> System.out.println(subject1));
        return timeTable;
    }

    public static void main(String[] args) {
        createTimeTable();
    }
}
