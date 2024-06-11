package Media;

import Candidate.Main;

public abstract class Media {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String mediaName;
    private double duration;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Media(String mediaName, double duration){
        this.mediaName = mediaName;
        this.duration = duration;

    }


}
