package org.samers;

import java.util.Scanner;

public class HelloName {
    public static void main (String args[]){

        //Skapa en Scanner-objekt för att läsa in data från användaren
        Scanner input = new Scanner (System.in);

        //Frågar användaren efter dess namn
        System.out.println("Vad heter du?");

        //Läser in användarens namn och sparar det i en variabel
        String name = input.nextLine();

        //Skriver ut ett hälsningsmeddelande med användarens namn
        System.out.println("Tjenixen " + name + "!");

    }
}
