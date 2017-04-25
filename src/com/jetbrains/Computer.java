package com.jetbrains;

/*
 * GC Java Bootcamp, Lydia Latocki 4/22/17.
 */

import java.util.Random;

public class Computer extends GamePieces {
    /*
    User plays against the Computer
    This generates the random result to compare to Player Input
    */
    private Random random;

    public Computer(){
        super();
        random = new Random();
    }

    public CHOICES getChoice(){ // CHOICES is the enum class for ROCK PAPER SCISSORS

        int choice = 1 + random.nextInt(3); // choice will hold choice of 1, 2, 3

        switch(choice){ // evaluate that choice. switch ends when case is matched.

            case 1:
                return CHOICES.ROCK; // pulling from GamePieces enum so all uses are linked, keyword 'return' acts as break

            case 2:
                return CHOICES.PAPER; // pulling from GamePieces enum

            //case 3: becomes default result
            default:
                return CHOICES.SCISSORS; // pulling from GamePieces enum

        }

    }

}
