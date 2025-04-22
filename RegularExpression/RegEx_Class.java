package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Class
{
    public static void main(String[] args)
    {
        String str = "adam plucked the apple and gave it aaron";
        String regex = "a+";
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(str);
        while (mt.find())
        {
            System.out.print("$");
            System.out.print(mt.group());
        }
    }
}