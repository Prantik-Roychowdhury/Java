package reflectionAPI;

import java.lang.reflect.*;

public class EmployeeDriver
{
    public static void main(String[] args) throws Exception
    {
        Class<?> employeeClass = Class.forName("Employee");

        // Fetching all the field names of a class
        Field[] fields = employeeClass.getDeclaredFields();
        for (Field f : fields)
        {
            System.out.println(f.getName());
        }

        // Changing the value of a field for a particular object
        Object employee = new Employee("Rohit",1, 1, 12000, 26);
        Field f = employeeClass.getDeclaredField("name");
        f.setAccessible(true);
        f.set(employee, "Ram");
        System.out.println(f.get(employee));
        f.setAccessible(false);

        System.out.println(((Employee) employee).getName());

        // Fetching all declared methods
        Method[] methods = employeeClass.getDeclaredMethods();
        for (Method method : methods)
        {
            System.out.println(method.getName());
        }

        System.out.println();

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(Deprecated.class))
            {
                System.out.println(method.getName());
                System.out.println(method.invoke(employee));
            }
        }
    }
}
