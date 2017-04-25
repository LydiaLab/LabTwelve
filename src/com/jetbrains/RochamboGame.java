package com.jetbrains;

import java.util.Scanner;

/*
 * GC Java Bootcamp, Lydia Latocki 4/22/17.
 */

public class RochamboGame extends GamePieces {

    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULTS results; // from enum
    private static int ties;
    private static int loses;
    private static int wins;

    public RochamboGame(){

        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        results = getResults();
        displayResults();
        stats();
//        displayStats();
    }

    private void stats(){

        if(results == RESULTS.WIN){
            wins++;
        }
        else if (results == RESULTS.LOSE){
            loses++;
        }
        else;
            ties++;
    }

    public void displayStats(){
        System.out.println("Man, you have played " + (ties + loses + wins) + " games.");
        System.out.println("Tied " + ties + " games.");
        System.out.println("Lost " + loses + " games.");
        System.out.println("Won " + wins + " games." + "\nThanks for playing.");
    }

    private void displayResults(){
        switch (results){
            case TIE:
                System.out.println("You Tied. " + playerChoice + " = " + computerChoice + ".");
                break;

            case LOSE:
                System.out.println("Boohoo. You Lost :( . " + computerChoice + " beats " + playerChoice + ".");
                break;

            case WIN:
                System.out.println("YOU WIN BIG TIME! " + playerChoice + " beats " + computerChoice + ".");
                break;

        }
        //default end switch
    }
    /*
       PAPER  beats  ROCK
        ROCK  beats  SCISSORS
    SCISSORS  beats  PAPER

     */

    public RESULTS getResults() { // game results
        Scanner scnr = new Scanner(System.in);
        RochamboGame rochamboGame = new RochamboGame();
        boolean keepGoing = true;


            if ((playerChoice == CHOICES.ROCK) && (computerChoice == CHOICES.SCISSORS)) { // CHOICES.SCISSORS
                return RESULTS.WIN;
            } else if ((playerChoice == CHOICES.ROCK) && (computerChoice == CHOICES.PAPER)) {
                return RESULTS.LOSE;
            } else if ((playerChoice == CHOICES.PAPER) && (computerChoice == CHOICES.SCISSORS)) {
                return RESULTS.LOSE;
            } else if ((playerChoice == CHOICES.PAPER) && (computerChoice == CHOICES.ROCK)) {
                return RESULTS.WIN;
            } else if ((playerChoice == CHOICES.SCISSORS) && (computerChoice == CHOICES.PAPER)) {
                return RESULTS.WIN;
            } else if ((playerChoice == CHOICES.SCISSORS) && (computerChoice == CHOICES.ROCK)) {
                return RESULTS.LOSE;
            } else if (playerChoice == computerChoice) { // pull one of three options out separately
                return RESULTS.TIE;
            } else;
                play();
        return null;
    }

}

//        if(playerChoice == computerChoice){ // pull one of three options out separately & rest of results can be an either/true : or/false result
//            return RESULTS.TIE;
//
//            switch (playerChoice){
//
//                case ROCK: // FIXME warning that this result is never possible
//                    return (computerChoice == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOSE); // like an either/or, both rt sides true or left side lose
//
//                case PAPER:
//                    return (computerChoice == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOSE);
//
//                case SCISSORS:
//                    return (computerChoice == CHOICES.PAPER ? RESULTS.WIN : RESULTS.LOSE);
//
//                default:
//
//                    //default - all options are stated above and this will never display sp no default needed
//            }
//        }
//        else{
//            // close the if statement with return, all options are stated above and this will never display
//            return RESULTS.LOSE;
//        }

