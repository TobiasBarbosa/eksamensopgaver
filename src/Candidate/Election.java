package Candidate;

import java.util.ArrayList;

public class Election {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    ArrayList<Candidate> candidateList;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Election(){
        candidateList = new ArrayList<>();
    }

    //***ADD METHOD***--------------------------------------------------------------------------------------------------
    public void addCandidateToElection(Candidate candidate){
    candidateList.add(candidate);
    }

    //***OTHER METHODS***-----------------------------------------------------------------------------------------------
    public int getTotalVotes(){
       int voteCount = 0;

       for(Candidate candidate : candidateList){
           voteCount += candidate.getNoOfVotes();

       }
       return voteCount;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesFromPartyList = new ArrayList<>();

        for(Candidate candidate : candidateList){
            if(candidate.getParty().equalsIgnoreCase(party)) {
                candidatesFromPartyList.add(candidate);
            }
        }
        return candidatesFromPartyList;
    }


    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "Election "                                + '\n' +
               "Candidates: "             + candidateList + '\n' +
                "Total number of votes: " + getTotalVotes() ;
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
