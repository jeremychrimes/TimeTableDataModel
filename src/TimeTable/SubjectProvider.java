package TimeTable;

import TimeTable.models.Subject;
import TimeTable.stores.SubjectStore;

import java.util.ArrayList;

public class SubjectProvider {
    private TimeTableContext context;
    private SubjectStore subjectStore;

    protected SubjectProvider(TimeTableContext context) {
        this.context = context;
        this.subjectStore = context.getTimeTableStore().getSubjectStore();
    }

    public ArrayList<Subject> getSubjects() {
        return subjectStore.getSubjects();
    }

}
