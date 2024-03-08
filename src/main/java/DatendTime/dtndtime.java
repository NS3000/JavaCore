package DatendTime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class dtndtime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        System.out.println(ld);
        System.out.println(LocalDate.parse("2002-09-25").getDayOfWeek());


        LocalTime IndTime  = LocalTime.now();
        LocalTime JpTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime ParTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("India :"+IndTime);
        System.out.println("Jpn :"+JpTime);
        System.out.println("Paris :"+ParTime);

        long IvsP = ChronoUnit.MINUTES.between(IndTime,ParTime);
        long IvsJ = ChronoUnit.MINUTES.between(IndTime,JpTime);

        System.out.println("diff between Ind and Jpn is "+IvsJ+" minutes");
        System.out.println("diff between Ind and Paris is "+IvsP+" minutes");

        System.out.println(OffsetTime.now().getOffset());

    }
}
