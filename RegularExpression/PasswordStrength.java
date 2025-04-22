package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength
{
    public static boolean isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        String password1 = "Strong@123";
        String password2 = "weakpass";

        System.out.println("Password 1 valid? " + isValidPassword(password1));  // true
        System.out.println("Password 2 valid? " + isValidPassword(password2));  // false
    }
}