package com.company;

public class stringMethods {
    public static void main(String[] args) {
        String name = "NISHTHA";
        System.out.println(name);
        int value = name.length();
//        System.out.println(value);
////        System.out.println(name.toLowerCase());
////        System.out.println(name.toUpperCase());
////        String nonTrimmedString = "    Nishtha   ";
////        System.out.println(nonTrimmedString);
////        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('S', 'K'));
        System.out.println(name.replace("THA", "IRT"));
        System.out.println(name.startsWith("NI"));
        System.out.println(name.endsWith("tye"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("A"));
        System.out.println(name.indexOf("A", 4));
        System.out.println(name.lastIndexOf("H"));
        System.out.println(name.equals("NISHTHA"));
        System.out.println(name.equalsIgnoreCase("nishtha"));
        //escape sequence
        System.out.println("I am escape sequence \" double quote");
    }
}
