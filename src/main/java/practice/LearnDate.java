package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDate {
    public void captureCurrentTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH-mm-ss");
        //System.out.println(dtf.format(dateTime));

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
