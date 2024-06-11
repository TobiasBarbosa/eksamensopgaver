package Names;

public class Names {

    //***ATTRIBUTES/INSTANCE VARIABLES***-------------------------------------------------------------------------------
    private String firstName;
    private String middleName;
    private String lastName;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Names(String firstName,String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Names(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getMiddleName(){
        return middleName;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        String result = "First name: " + firstName + '\n';
            if(middleName != null){
                result += "Middle name: " + middleName + '\n';
            }
            result += "Last name: " + lastName;
            return result;
    }



}
