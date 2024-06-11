package BMI;

public class BMI {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private double height;
    private double weight;
    private double bmi;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
        bmi = calculateBMI(height, weight);

    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public double calculateBMI(double height, double weight){
        double bmi = weight / (height*2);
        return bmi;
    }

    public boolean isUnderWeight() {
        if (bmi < 18.5) {
            return true;
        }
        return false;
    }

        public boolean isNormalWeight(){
            if(bmi > 18.5 && bmi < 25){
                return true;
            }
            return false;
        }


    public boolean isOverWeight(){
        if (bmi > 25){
            return true;
        }
        return false;
    }

    //***SIMPLIFIED VERSION***------------------------------------------------------------------------------------------
    //public boolean isOverWeight(){
    //        return bmi > 25;
    //}

    //***TO STRING***---------------------------------------------------------------------------------------------------
    public String toString(){
        String result = "BMI: " + bmi + '\n';

        if (isUnderWeight()) {
            result += "You are underweight";
        } else if (isNormalWeight()) {
            result += "You have a normal weight";
        } else if (isOverWeight()) {
            result += "You are overweight";
        }

        return result;
    }

    //------------------------------------------------------------------------------------------------------------------
}
