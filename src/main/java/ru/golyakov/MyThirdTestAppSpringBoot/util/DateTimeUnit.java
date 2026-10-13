package ru.golyakov.MyThirdTestAppSpringBoot.util;

import java.text.SimpleDateFormat;

public class DateTimeUnit {

    public static SimpleDateFormat getCustomFormat() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }
}
