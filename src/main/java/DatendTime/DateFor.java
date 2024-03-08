package DatendTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        Date d = DateFormat.getDateInstance().parse("31-Mar-2015");
        System.out.println(d);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy MMMM dd");

        System.out.println(df1.format(date));
        System.out.println(df.format(date));
        System.out.println(df2.format(date));

        Date pd1 = df1.parse("31/03/2005");
        System.out.println(pd1);

    }
}
