package Practice;

import java.util.Objects;

public class Subtraction implements Operations
{
    @Override
    public Double calculate(Object a, Object b)
    {
        Objects.requireNonNull(a,"Cannot be null");
        Objects.requireNonNull(b,"Cannot be null");
        if(a instanceof Number && b instanceof  Number)
        {
            double val1 = ((Number)a).doubleValue();
            double val2 = ((Number)b).doubleValue();
            return Math.abs(val1-val2);
        }
        else
        {
            throw new IllegalArgumentException("Operands must be numbers (int, float, double, etc.)");
        }
    }
}