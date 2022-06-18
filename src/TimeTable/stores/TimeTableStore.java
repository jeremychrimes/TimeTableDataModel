package TimeTable.stores;

public interface TimeTableStore {
    public PeriodStore getPeriodStore();
    public SubjectStore getSubjectStore();
    public ClassSessionStore getClassSessionStore();
}
