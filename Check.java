/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package run;

//import java.io.IOException;
//import java.util.Scanner;

/**
 *
 * @author TA
 */
/*public class Check {
    package run;
import java.util.*;
import java.io.*;
public class Run{
public static void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number");
    String integerS = keyboard.nextLine();

    String[] parts = integerS.split("[.]");
    String centsString;
    //cents
    if (parts.length < 2) {
        centsString = "and Zero cents.";
    } 
    else if (Integer.parseInt(parts[1]) == 0) {
        centsString = "and Zero cents.";
    } 
    else {
        centsString = " and " + numbersToString(Integer.parseInt(parts[1])) + "cents.";
    }
    //integers
    String integerString = numbersToString(Integer.parseInt(parts[0]));

    System.out.println(integerString + "dollars " + centsString);
}

private static String numbersToString(int number) {
    System.out.println(number);
    switch (number) {
        case 0:
            return "";
        case 1:
            return "One ";
        case 2:
            return "Two ";
        case 3:
            return "Three ";
        case 4:
            return "Four ";
        case 5:
            return "Five ";
        case 6:
            return "Six ";
        case 7:
            return "Seven ";
        case 8:
            return "Eight ";
        case 9:
            return "Nine ";
        case 10:
            return "Ten ";
        case 11:
            return "Eleven ";
        case 12:
            return "Twelve ";
        case 13:
            return "Thirteen ";
        case 14:
            return "Fourteen ";
        case 15:
            return "Fifteen ";
        case 16:
            return "Sixteen ";
        case 17:
            return "Seventeen ";
        case 18:
            return "Eighteen ";
        case 19:
            return "Nineteen ";
        case 20:
            return "Twenty ";
        case 30:
            return "Thirty ";
        case 40:
            return "Fourty ";
        case 50:
            return "Fifty ";
        case 60:
            return "Sixty ";
        case 70:
            return "Seventy ";
        case 80:
            return "Eighty ";
        case 90:
            return "Ninety ";
        default:
            int hundredMillions = number % 1000000000 / 1000000;
            int hundredThousands = number % 1000000 / 1000;
            int hundreds = number % 1000 / 100;
            int decimals = number % 100 / 10;
            int integers = number % 10;

            String result = "";
            if (hundredMillions > 0) {
                result += numbersToString(hundredMillions) + "million, ";
            }
            if (hundredThousands > 0) {
                result += numbersToString(hundredThousands) + "thousand, ";
            }
            if (hundreds > 0) {
                result += numbersToString(hundreds) + "hundred ";
            }
            if (decimals > 1) {
                result += numbersToString(decimals * 10);
                if (integers > 0) {
                    result += numbersToString(integers);
                }
            } else if (decimals != 0) {
                result += numbersToString(decimals * 10 + integers);
            }

            return result;
    }
}
}   
          
   
}*/
