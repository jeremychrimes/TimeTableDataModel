package TimeTable.plugins;

import TimeTable.models.ClassSession;
import TimeTable.models.Period;
import TimeTable.models.Subject;
import TimeTable.stores.ClassSessionStore;
import TimeTable.stores.PeriodStore;
import TimeTable.stores.SubjectStore;
import TimeTable.stores.TimeTableStore;

import java.util.ArrayList;

public class ObjectTimetableStore implements TimeTableStore, ClassSessionStore, PeriodStore, SubjectStore {
    private ArrayList<ClassSession> classSessions;
    private ArrayList<Period> periods;
    private ArrayList<Subject> subjects;

    public ObjectTimetableStore(ArrayList<ClassSession> classSessions,
                                ArrayList<Period> periods,
                                ArrayList<Subject> subjects) {
        this.classSessions = classSessions;
        this.periods = periods;
        this.subjects = subjects;
    }


    public void setClassSessions(ArrayList<ClassSession> classSessions) {
        this.classSessions = classSessions;
    }

    public void setPeriods(ArrayList<Period> periods) {
        this.periods = periods;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public ArrayList<ClassSession> getClassSessions() {
        return classSessions;
    }

    @Override
    public ArrayList<Period> getPeriods() {
        return periods;
    }

    @Override
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public PeriodStore getPeriodStore() {
        return this;
    }

    @Override
    public SubjectStore getSubjectStore() {
        return this;
    }

    @Override
    public ClassSessionStore getClassSessionStore() {
        return this;
    }
}
