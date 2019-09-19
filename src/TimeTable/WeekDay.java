package TimeTable;

public enum WeekDay {
    // Define the properties which the Enumerator can take
    Monday ("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"), 
    Sunday("Sunday");

    // A private property which contains the day name to be defined by the constructor
    private final String dayname; 

    // A constructor which tells the program how the properties are to work
    private WeekDay(String s) { 
        dayname = s;
    }

    // A method to get the  string of the 
    public String toString () {
        return this.dayname;
    }
    
    public static WeekDay fromString(String dayname) {
        if (dayname.toUpperCase().contains("MONDAY")) {
            return WeekDay.Monday;
        } else if (dayname.toUpperCase().contains("TUESDAY")) {
            return WeekDay.Tuesday;
        } else if (dayname.toUpperCase().contains("WEDNESDAY")) {
            return WeekDay.Wednesday;
        } else if (dayname.toUpperCase().contains("THURSDAY")) {
            return WeekDay.Thursday;
        } else if (dayname.toUpperCase().contains("FRIDAY")) {
            return WeekDay.Friday;
        } else if (dayname.toUpperCase().contains("SATURDAY")) {
            return WeekDay.Saturday;
        } else if (dayname.toUpperCase().contains("SUNDAY")) {
            return WeekDay.Saturday;
        } else {
            throw new IllegalArgumentException("Day not found");
        }
    }

    
}