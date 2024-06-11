package Candidate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Candidate candidate1 = new Candidate("Barack Obama", "Democrats", 1034987);
        Candidate candidate2 = new Candidate("Donald Trump", "Republicans", 784789);
        Candidate candidate3 = new Candidate("Loviisa Mujunen", "Democrats", 49874833);
        Candidate candidate4 = new Candidate("Monir Mooghen", "Republicans", 49874833);

        Election election2024 = new Election();

        election2024.addCandidateToElection(candidate1);
        election2024.addCandidateToElection(candidate2);
        election2024.addCandidateToElection(candidate3);
        election2024.addCandidateToElection(candidate4);

        System.out.println(candidate1);
        System.out.println(election2024);
        System.out.println(election2024.getTotalVotes());
        System.out.println("Which party do you want to see the candidate list?");
        String party = input.nextLine();
        System.out.println(election2024.getCandidatesFromParty(party));


    }
}
