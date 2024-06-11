package Candidate;

public class Candidate {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String candidateName;
    private String party;
    private int noOfVotes;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Candidate(String candidateName, String party, int noOfVotes){
        this.candidateName = candidateName;
        this.party = party;
        this.noOfVotes = noOfVotes;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getParty(){
        return party;
    }

    public int getNoOfVotes(){
        return noOfVotes;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "Candidate name: "  + candidateName + '\n' +
               "Party: "           + party         + '\n' +
               "Number of votes: " + noOfVotes     + '\n' ;
    }


}
