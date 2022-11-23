package com.company;

public class stringProblems {
    public static void main(String[] args){
        String city= "Indore";
        System.out.println(city.toLowerCase());
        String state = "  Madhya  Pradesh ";
        System.out.println(state.replace(" ", "_"));
        String template = "Dear |name|, Thanks a lot!";
        System.out.println(template.replace("|name|", "Bhooma"));
        System.out.println(state.indexOf("  "));
        System.out.println(state.indexOf("   "));
        String thanks = "Dear \tHarry, \nthis Java course is nice. Thanks!";
        System.out.println(thanks);

    }
}
