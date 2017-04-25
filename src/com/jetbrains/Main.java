package com.jetbrains;

/*
 * GC Java Bootcamp, Lydia Latocki 4/22/17.
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        RochamboGame rochamboGame = new RochamboGame();
        boolean keepGoing = true;

        while (keepGoing)
        rochamboGame.displayStats();
    }
}
