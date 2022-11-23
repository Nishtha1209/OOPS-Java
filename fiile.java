package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fiile {
    public static void main(String[] args) {
        //CODE TO CREATE A NEW FILE
        /*File myfile = new File("file.txt");
        try {
            myflie.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        //CODE TO WRITE TO A FILE
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is our first file from this java course\n okay now bye!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        //READING A FILE
        File myfile = new File("file.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
            catch (FileNotFoundException e) {
            e.printStackTrace();*/

        File myfile = new File("file.txt");
        if (myfile.delete()){
            System.out.println("I have deleted: "+ myfile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file");
        }

    }

}
