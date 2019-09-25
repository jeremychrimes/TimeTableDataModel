package TimeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Period {
    public Integer periodNumber;
    public Time startTime;
    public Time endTime;

    public static List<Period> loadPeriods(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        List<Period> periods = new ArrayList<Period>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Time startTime = new Time(lineArray[1]);
            Time finishTime = new Time(lineArray[2]);
            Period p = new Period();
            p.periodNumber = Integer.valueOf(lineArray[0]);

            // System.out.println(p.periodNumber);
            p.startTime = startTime;
            p.endTime = finishTime;
            periods.add(p);
        }
        sc.close(); // CLose the scanner
        return periods;
    }
    
    public static void saveToFile(List<Period> periods, String filename) throws FileNotFoundException, IOException {
        System.out.println(filename);
        FileWriter fw = new FileWriter(filename);
        for (Period period : periods) {
            String line = String.join(",", String.valueOf(period.periodNumber), period.startTime.toString(),
                    period.endTime.toString(), "\n");
            fw.write(line);
        }
        fw.close();
    }
}