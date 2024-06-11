package Beer;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;


    public Beer(String name, double alcoholPercentage, double price){
        this.name = name;
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
    }

    public void setAlcoholPercentage(double alcoholPercentage){
        if(alcoholPercentage>0 && alcoholPercentage<=100){
            this.alcoholPercentage = alcoholPercentage;
    } else {
            throw new IllegalArgumentException("Alcohol percentage must be above 0 and under 100 percent");
        }
    }

    public void setPrice(double price){
        if(price>0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be over 0");
        }
    }

    public double getPrice(){
        return price;
    }

   @Override
   public String toString(){
        return "Ølnavn: " + name + "\nProcent: " + alcoholPercentage + "\nPris: " + price + '\n';
   }

}
