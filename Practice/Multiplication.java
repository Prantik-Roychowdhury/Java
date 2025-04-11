package Practice;

import java.util.Objects;

public class Multiplication implements Operations
{
    public Double calculate(Object a, Object b)
    {
        Objects.requireNonNull(a,"Cannot be null");
        Objects.requireNonNull(b,"Cannot be null");
        if(a instanceof Number && b instanceof  Number)
        {
            double val1 = ((Number)a).doubleValue();
            double val2 = ((Number)b).doubleValue();
            return val2*val1;
        }
        else
        {
            throw new IllegalArgumentException("Operands must be numbers (int, float, double, etc.)");
        }
    }
}
