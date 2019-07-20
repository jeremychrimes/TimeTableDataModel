package app;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        String time = "24:00:00";
        Pattern pattern = Pattern.compile("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9])$");
        Boolean matcher = pattern.matcher(time).matches();

        System.out.println(matcher);
    }
}