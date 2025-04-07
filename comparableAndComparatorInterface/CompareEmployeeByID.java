package comparableAndComparatorInterface;
import java.util.*;
public class CompareEmployeeByID implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        Emplyee e1 = (Emplyee)o1;
        Emplyee e2 = (Emplyee)o2;
        return e1.id - e2.id;
    }
}