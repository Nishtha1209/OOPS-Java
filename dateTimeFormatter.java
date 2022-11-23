package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); //THIS IS THE DATE
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E a: H");//THIS ID FORMAT
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df); //CREATING DATE STRING USING DATE AND TIME FORMAT
        System.out.println(myDate);

    }
}
