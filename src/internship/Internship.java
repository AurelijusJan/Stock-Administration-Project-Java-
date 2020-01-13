/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aurelijus
 */
public class Internship {

 public static void main(String... args) throws ParseException {

        Scanner in = new Scanner(System.in);
        System.out.println("|ITEM QUANTITY CHECK - 1| |ITEM EXPIRATION DATE CHECK - 2| |INSTRUCTIONS - 3| |EXIT - 4|");
        int a = in.nextInt();

        while (a != 4) {
            switch (a) {
                case 1:
                    quantityCheck();
                    break;
                case 2:
                    expirationDateCheck();
                    break;
                case 3:
                    System.out.println("'ITEM QUANTITY CHECK' - prints all the items with the quantity lower than the input number \n"
                            + "'ITEM EXPIRATION DATE CHECK' - prints all the items with the date before the input date \n"
                            + "'INSTRUCTIONS' - prints program instructions \n"
                            + "'EXIT' - exits program \n");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("-WRONG INPUT-");
                    break;
            }
            System.out.println("|ITEM QUANTITY CHECK - 1| |ITEM EXPIRATION DATE CHECK - 2| |INSTRUCTIONS - 3| |EXIT - 4|");
            a = in.nextInt();
        }
    }

    private static void quantityCheck() {
        
        //List<Item> items = CSVreader.readFromCSV("C:\\Users\\Aurelijus\\Desktop\\sample.csv"); <--ABSOLUTE PATH
        
        //RELATIVE PATH
        List<Item> items = CSVreader.readFromCSV("sample.csv");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for item quantity check: ");
        int a = in.nextInt();

        for (Item i : items) {
            int q = Integer.parseInt(i.getItemQuantity());
            if (q < a) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    private static void expirationDateCheck() {
        
        //List<Item> items = CSVreader.readFromCSV("C:\\Users\\Aurelijus\\Desktop\\sample.csv"); <--ABSOLUTE PATH
        
        //RELATIVE PATH
        List<Item> items = CSVreader.readFromCSV("sample.csv");

        Scanner in = new Scanner(System.in);
        System.out.println("Date Example: 01/21/2018");
        System.out.print("Enter date: ");
        String a = in.nextLine();

        while (a.length() != 10) {
            System.out.println("-WRONG INPUT-");
            System.out.println("Date Example: 01/21/2018");
            System.out.print("Enter date: ");
            a = in.nextLine();
        }

        for (Item i : items) {
            String b = i.getItemExpirationDate();

            try {
                Date CSVdate = new SimpleDateFormat("MM/dd/yyyy").parse(b);
                Date inputDate = new SimpleDateFormat("MM/dd/yyyy").parse(a);
                if (CSVdate.compareTo(inputDate) < 0) {
                    System.out.println(i);
                }
            } catch (ParseException e) {
                System.out.println("Date conversion error");
            }
        }
        System.out.println();
    }
}