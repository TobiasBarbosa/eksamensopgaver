package Rafflebaeger;

import java.util.Random;

public class Raflebaeger {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    int noOfDices;
    int max = 6;
    Random random = new Random();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Raflebaeger(int noOfDices){
    this.noOfDices = noOfDices;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public int[] shakeRaffle(){
        int facevalues[] = new int[noOfDices];
        for(int i= 0; i < noOfDices; i++){
            facevalues[i] = random.nextInt(max)+1;
        }
        return facevalues;
    }

    //***TO STRING***---------------------------------------------------------------------------------------------------
    public String toString(){
        return "no of dices in raffle: " + noOfDices;
    }

    //------------------------------------------------------------------------------------------------------------------
}
