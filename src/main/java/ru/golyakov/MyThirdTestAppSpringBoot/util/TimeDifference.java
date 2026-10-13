package ru.golyakov.MyThirdTestAppSpringBoot.util;

import java.text.ParseException;
import java.util.Date;

public class TimeDifference {
    public static long getTimeDifference(String systemTime)
            throws ParseException {
        Date startTime =
                DateTimeUnit.getCustomFormat().parse(systemTime);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }
}
