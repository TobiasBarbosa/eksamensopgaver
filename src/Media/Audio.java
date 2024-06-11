package Media;

public class Audio extends Media{

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private double aspectRatio;

    public Audio(String mediaName, double duration, double aspectRatio){
        super(mediaName,duration);
        this.aspectRatio = aspectRatio;
    }


}
