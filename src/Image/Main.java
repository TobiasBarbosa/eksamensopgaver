package Image;

public class Main {

    public static void main(String[] args) {

        Image image1 = new Image("Bog.jpg.",    16.9, 9.6);
        Image image2 = new Image("Bord.jpgg",   10.5, 20.6);
        Image image3 = new Image("Stol.gif",    18.7, 8.3);
        Image image4 = new Image("Blyant.JPG.", 15,   9);

        System.out.println(image1);
        System.out.println(image2);
        System.out.println(image3);
        System.out.println(image4);


    }
}
