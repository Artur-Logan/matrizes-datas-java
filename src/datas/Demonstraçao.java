package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Demonstraçao {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(0L);
        Date date3 = new Date(1000L * 60 * 60 * 5);

        Date y1 = simpleDateFormat.parse("25/06/2018");
        Date y2 = simpleDateFormat2.parse("25/12/2001 23:59:59");

        System.out.println("y1 " + simpleDateFormat2.format(y1));
        System.out.println("y2 " + simpleDateFormat2.format(y2));
        System.out.println("date: " + date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println("------------------------------------");

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(simpleDateFormat1.format(d));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int minutos = calendar.get(Calendar.MINUTE);
        int mes = 1 + calendar.get(Calendar.MONTH);

        System.out.println(d);
        System.out.println("Minutos: " + minutos);
        System.out.println("Mes " +  mes );
    }
}
