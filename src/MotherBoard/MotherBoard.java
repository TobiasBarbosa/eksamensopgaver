package MotherBoard;

import java.util.ArrayList;

public class MotherBoard {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private ArrayList<SataDrive> sataDriveList;
    private String motherBoardName;

     public MotherBoard(String motherBoardName){
            this.motherBoardName = motherBoardName;
            sataDriveList = new ArrayList<>();
     }


     public void addSataDrive(SataDrive sataDrive){
          if(sataDriveList.size() >= 4){
            throw new IllegalArgumentException("Mother Board has already 4 sata Drives. Therefore you can't add another drive.");
         } else {
                sataDriveList.add(sataDrive);
         }
     }

     //***TO STRING METHOD***-------------------------------------------------------------------------------------------
    @Override
    public String toString(){
         return "Mother Board name: " + motherBoardName + '\n' +
                "Sata Drives: " + sataDriveList;
    }




}
