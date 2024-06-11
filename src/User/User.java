package User;

import java.util.ArrayList;

public class User {

    private String fullName;
    private String userID;

    public User(String fullName, String userID) {
        this.fullName = fullName;
        this.userID = userID;

    }

    public boolean validUserID() {
        int letterCount = 0;
        int intCount = 0;

        char[] charList = userID.toCharArray();

        //lav et for loop i stedet!!
        for (char letter : charList) {
            if (Character.isLowerCase(letter)) {
                letterCount++;
            }
        }

        for (int number : charList) {
            intCount++;
        }

        if (userID.length() == 8 && letterCount == 4 && intCount == 4){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "User \n" +
                        "Full Name: " + fullName + '\'' ;

                 if(validUserID()) {
                 result += "UserID: " + userID + '\'';
             }
                 return result;
    }
}
