package learn.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws  Exception{
    Instant instant = Instant.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-DD-YYYY");
    System.out.println(LocalDate.parse("08-01-1980",myFormatObj));
    //LocalDate localdate = LocalDate.parse("08-01-1980",myFormatObj);

    //System.out.println(localdate.getMonth());
    }


}
