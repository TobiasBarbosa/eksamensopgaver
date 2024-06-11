package Media;

public class Video extends Media{

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private double loudness;

    public Video(String mediaName, double duration, double loudness){
        super(mediaName, duration);
        this.loudness = loudness;

    }


}
