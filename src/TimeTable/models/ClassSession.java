package TimeTable.models;

public class ClassSession {
    private Subject subject;
    private Period period;
    private WeekDay day;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public WeekDay getDay() {
        return day;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

    public ClassSession() {
    }
    public ClassSession(Subject subject, Period period, WeekDay day) {
        this.subject = subject;
        this.period = period;
        this.day = day;
    }

    @Override
    public String toString() {
        String name = this.subject.getName();
        String teacher = this.subject.getTeacher();
        String startTime = this.period.getStartTime().toString();
        String endTime = this.period.getEndTime().toString();
        String returnValue = String.join(", ", name, teacher, startTime, endTime);
        return returnValue;
    }
}
