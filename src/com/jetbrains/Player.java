package com.jetbrains;

import java.util.Scanner;

/*
 * GC Java Bootcamp, Lydia Latocki 4/22/17.
 */

public class Player extends GamePieces {
        Scanner scnr; // include scnr here so line 20 will see it.

    public Player(){

        super();
          scnr = new Scanner(System.in);
    }

    public CHOICES getChoice(){

        System.out.println("Lets Play ROCK / PAPER / SCISSORS!  \nMake your choice and enter letter  R  P  or  S:" );
        char playerChoice = scnr.nextLine().toUpperCase().charAt(0); // will use first letter of input regardless of user input

        switch (playerChoice){ // user input passed through the cases. switch ends when case is matched.

        case 'R':
            return CHOICES.ROCK; // pulled from enum so all uses are linked

        case 'P':
            return CHOICES.PAPER; // pulled from enum

        case 'S':
            return CHOICES.SCISSORS; // pulled from enum
        }
    // invalid user input at line20
    System.out.println("OOPS! try  R  P  or S to play Roshambo");
        return getChoice();
    }
}
