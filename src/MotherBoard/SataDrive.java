package MotherBoard;

public class SataDrive {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String nameDrive;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SataDrive(String nameDrive){
    this.nameDrive = nameDrive;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
        return "Sata Drive name: " + nameDrive;
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
