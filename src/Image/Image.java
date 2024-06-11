package Image;

public class Image {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String fileName;
    private double width;
    private double height;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Image(String fileName, double width, double height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    private boolean isKnownFileType(){
        return fileName.endsWith(".gif") || (fileName.endsWith("jpg.") || fileName.endsWith("jpeg.") ||
               fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bmp"));
    }

    private boolean isPortrait(){
        return height > width;
    }

    private boolean isLandscape(){
        return width > height;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
        String result =
                "Image\n" +
                "File name: " + fileName + '\n' +
                "Width: "     + width    + '\n' +
                "Height: "    + height   + '\n' +
                "Known file type: ";

        if (isKnownFileType()){
            result += "Yes, file is known\n";
        } else {
            result += "No, file is not known\n";
        }

        result += "Display mode: ";

        if(isLandscape()){
            result += "Landscape\n";
        } else if(isPortrait()){
            result += "Portrait\n";
        }

        return result;

    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
