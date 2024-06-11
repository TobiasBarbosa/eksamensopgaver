package JuleGave;

import java.util.Random;

public class JuleGave {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;
    Random random = new Random();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public JuleGave(){
        isSoft        = makeRandom();
        isRectangular = makeRandom();
        doesRattle    = makeRandom();
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public boolean makeRandom(){
        boolean randomBoolean = random.nextBoolean();
       return randomBoolean;
    }

    public boolean couldBeLego(){
        boolean couldBeLego = false;

        if(!isSoft && isRectangular && doesRattle){
            couldBeLego = true;
        }
        return couldBeLego;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
        String result = "Christmas Present \n" +
                        "Is the present package soft: ";
                if (isSoft){
                    result += "Yes, the present is soft\n";
                } else {
                    result += "No, the present is not soft\n";
                }

                result += "Is the present rectangular: ";
                if (isRectangular){
                  result += "Yes, the present is rectangular\n";
                } else {
                  result += "No, the present is not rectangular\n";
                }

                result += "Does the present rattle: ";
                if (doesRattle){
                    result += "Yes, the present rattles\n";
                } else {
                    result += "No, the present does not rattle\n";
                }

                result += "Could the present be Lego: ";
                if (couldBeLego()){
                   result += "Yes, the present could be Lego\n";
               } else {
                 result += "No, the present could not be Lego\n";
               }

                return result;
    }

    //------------------------------------------------------------------------------------------------------------------
}
