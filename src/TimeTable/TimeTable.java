package TimeTable;
public class TimeTable {
    private TimeTableContext context;
    private SubjectProvider subjectProvider;

    TimeTable(TimeTableContext context) {
        this.context = context;
        this.subjectProvider = new SubjectProvider(context);
    }

    public SubjectProvider getSubjectProvider() {
        return subjectProvider;
    }
}