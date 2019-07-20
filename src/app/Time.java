package app;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Time { 
    public Integer days;
    public Integer hours;
    public Integer minutes;
    public Integer seconds;

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

    public Time(Integer hours, Integer minutes, Integer seconds) { 
        this.days = 0;
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public Time(String time) {
    }
    public Time() { 
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
}