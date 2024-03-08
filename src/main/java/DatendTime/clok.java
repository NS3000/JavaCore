package DatendTime;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class clok {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        DayOfWeek dw1 = DayOfWeek.MONDAY;
        DayOfWeek dw2 = DayOfWeek.TUESDAY;
        System.out.println(dw1.compareTo(dw2));
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());



    }
}
