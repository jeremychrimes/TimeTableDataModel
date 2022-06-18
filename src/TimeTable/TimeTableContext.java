package TimeTable;

import TimeTable.stores.TimeTableStore;

public class TimeTableContext {
    private TimeTableStore timeTableStore;
    private TimeTable timeTable;

    TimeTableContext(TimeTableStore timeTableStore) {
        this.timeTableStore = timeTableStore;
        timeTable = new TimeTable(this);
    }

    public TimeTableStore getTimeTableStore() {
        return timeTableStore;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

}
