package com.company;
import java.util.Scanner;
public class Main {

//pub st typ
//new
//pri st vo

    /*
    //program 1
    public static String getName(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return (name);
    }

    public static void main(String[] args) {
    String Names[] = {"Ben","Thor","Zoe","Kate"};
    int Max = 3;
    int Current = 0;
    boolean Found = false;
    System.out.println("what player are you looking for?");
    String playerName = getName();
    while (Found == false && Current <= Max) {
        if (Names[Current].equals(playerName)) {
            Found = true;
        }else {
            Current++;
        }
    }
    if (Found == true) {
        System.out.println("Yes, they do have a top score");
    }else {
        System.out.println("NO, they do not have a top score");
    }


    }
     */

    //program 2
    /*
    public static Integer getNum(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return (num);
    }

    public static void main(String[] args) {
        int reverseBinary[] = new int[8];
        System.out.println("enter a number from 0-255");
        int number = getNum();
        System.out.println("reverse binary:");
        for (int i = 0; i < 8; i++) {
            int binaryBit = (number % 2);
            number = (number / 2);
            reverseBinary[i] = binaryBit;
            System.out.print(binaryBit);
        }
        System.out.println("");
        System.out.println("binary:");
        for (int i = 7; i >= 0; i--) {
            System.out.print(reverseBinary[i]);
        }

    }
    */

    //program 3

    public static String getWord(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word to covert to leetspeak (in all caps)");
        String word = input.next();
        return (word);
    }

    public static void main(String[] args) {
        char charsToFind[] = {'A','B','E','I','L','M','N','O','S','T','V','W'}; // list of chars that have convertions
        String leetConversions[] = {"4","6","3","1","1","(V)","(\\)","0","5","7","\\/","'//"}; // list of those convertions in the corresponding index positions
        String word = getWord(); // calls method to get the inputed word
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {  // for loop to covert whole word
            boolean notConverted = true;
            char currentChar = word.charAt(i); // variable for current charcter in the word starting at the first one and then loops through them all
            for (int j = 0; j < 12; j++) {
                if (currentChar == (charsToFind[j])) { // checks if the current character has a convertion and if it does it prints that convertion
                    System.out.print(leetConversions[j]);
                    notConverted = false;
                    }
                }
            if (notConverted == true) {
                System.out.print(currentChar); // if character was not converted it prints the charcter
            }
            } // end of loop
        }





}

