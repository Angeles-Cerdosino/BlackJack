package backend.BlackJack.utils;

public class Validator {
    public static boolean isValidPass(String pass)  {
        String regex = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";
        return pass.matches(regex);
    }

    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}
