package TimeTable.models;
import java.util.regex.Pattern;

public class Time {
    private Integer days;
    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    public void setHours(Integer hours) { 
        while (hours > 24) {
            hours = hours - 24; 
            this.days += 1;
        }
        this.hours = hours;
    }
    public void setMinutes(Integer minutes) { 
        while (minutes > 60) { 
            minutes = minutes - 60;
            setHours(this.hours + 1);
        }
        this.minutes = minutes;
    }
    public void setSeconds(Integer seconds) { 
        while (seconds > 60) { 
            seconds = seconds - 60;
            setMinutes(this.minutes + 1);
        }
        this.seconds = seconds;
    }

    public Integer getDays() {
        return days;
    }

    public Integer getHours() {
        return hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public Time(Integer hours, Integer minutes, Integer seconds) {
        this.days = 0;
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public Time(String time) {
        Pattern pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        Boolean matcher = pattern.matcher(time).matches();
        // System.out.println(matcher);
        if (matcher == true) { 
            String[] newTime = time.split(":");
            setHours(Integer.parseInt(newTime[0]));
            setMinutes(Integer.parseInt(newTime[1]));
            setSeconds(Integer.parseInt(newTime[2]));
        }
        else {
            throw new IllegalArgumentException("Sorry that time is not in the correct format");
        }
    }
    public Time() { 
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    public String toString() {
        String returnValue = String.join(":", String.format("%02d", this.hours),
                String.format("%02d", this.minutes) , String.format("%02d", this.seconds));
        return returnValue;
    }
}