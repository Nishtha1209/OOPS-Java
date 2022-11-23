package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class advPracticeSet {
    public static void main(String[] args) {
        //QUESTION 1
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (Object o: ar){
            System.out.println(o);
        }

        //QUESTION 2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //QUESTION 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" + c.get(Calendar.MINUTE)+ ":"+ c.get(Calendar.SECOND));

        //QUESTION 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);

        //QUESTION 5
        HashSet<Integer> s = new HashSet<>();
        s.add(4);
        s.add(5);
        s.add(45);
        s.add(3);
        s.add(67);
        s.add(5);
        System.out.println(s);
    }
}
