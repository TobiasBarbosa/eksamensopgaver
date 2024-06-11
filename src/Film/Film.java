package Film;

import java.time.LocalDate;

public class Film {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String movieTitle;
    private int yearPublished;
    private Producer producer;

    //***CONSTRUCTORS***-------------------------------------------------------------------------------------------------
    public Film(String movieTitle, int yearPublished, Producer producer){
        this.movieTitle    = movieTitle;
        this.yearPublished = yearPublished;
        this.producer      = producer;

    }

    public Film(String movieTitle){
        this.movieTitle = movieTitle;
        this.yearPublished = LocalDate.now().getYear();
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        String result = "Movie: "   + movieTitle    + '\n' +
                "Publishing year: " + yearPublished + '\n' ;

        if (producer != null) {
            result += producer.getProducerName() + '\n';
        }
        return result;
    }



    //***END CLASS***---------------------------------------------------------------------------------------------------
}
