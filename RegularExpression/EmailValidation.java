package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation
{
    public static void main(String[] args)
    {
        String regex = "^[a-zA-Z0-9_+&*-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String email = "rohit.jay48@gmail..com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find())
        {
            System.out.println(matcher.group() + "  " + matcher.start());
        }
        else
        {
            System.out.println("match not found");
        }
    }
}