package MotherBoard;

public class Main {
    public static void main(String[] args) {

        MotherBoard motherBoard = new MotherBoard("Mother Board 1");

        SataDrive sataDrive1 = new SataDrive("Sata Drive 1");
        SataDrive sataDrive2 = new SataDrive("Sata Drive 2");
        SataDrive sataDrive3 = new SataDrive("Sata Drive 3");
        SataDrive sataDrive4 = new SataDrive("Sata Drive 4");
        SataDrive sataDrive5 = new SataDrive("Sata Drive 5");

        motherBoard.addSataDrive(sataDrive1);
        motherBoard.addSataDrive(sataDrive2);
        motherBoard.addSataDrive(sataDrive3);
        motherBoard.addSataDrive(sataDrive4);
        //motherBoard.addSataDrive(sataDrive5);

        System.out.println(motherBoard);
    }
}
