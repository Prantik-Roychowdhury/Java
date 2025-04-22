package RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class PhoneNumberValidation
{
    public static void main(String[] args)
    {
        String regex = "[789]{1}\\d{9}";
        String text = "7588203920,7896543256";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            System.out.println(matcher.group() + " -> " + matcher.start());
        }

//        if (!matcher.find())
//        {
//            System.out.println("match not found");
//        }
//
//        int[] arr = {6, 4, 7, 8, 25, 14};
//        Object o = arr;
//
//        List<Object> l1 = Arrays.asList(12, "hello");
//        System.out.println(l1);
//
//        List<Integer> list = new ArrayList<Integer>();
//        list = Arrays.asList(10, 20, 30);
//        System.out.println(list);
//
//        List<Integer> l3 = Arrays.asList(10, 20, 30);
//        for (Object i : l1) {
//            System.out.println(i);
//        }
    }
}