package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver
{
    public static void main(String[] args)
    {
        ArrayList<Employee>emp = new ArrayList<>();
        emp.add(new Employee("ABC",1));
        emp.add(new Employee("DEF",2));
        emp.add(new Employee("GHI",3));
        for(Employee e: emp)
        {
            System.out.println(e);
        }
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println();
        /*
        for(int val:arrayList)
        {
            if (val==5)
            {
                Integer x = val;
                arrayList.remove(x);
                break;
            }
            System.out.print(val+" ");
        }
        */
        Iterator<Integer>itr = arrayList.iterator();
//        while (itr.hasNext())
//        {
//            int x = itr.next();
//            if(x==5)
//            {
//                itr.remove();
//            }
//        }
        //We can also ue lambda function called removeIf()
        arrayList.removeIf(x -> x==5);
        emp.removeIf(employee -> employee.name.equals("ABC"));
        System.out.println(emp);
//      Iterator<Employee>i = emp.iterator();

//        ListIterator list = arrayList.listIterator();
//        while (list.hasNext())
//        {
//            System.out.println("Index:  "+list.nextIndex()+"    Element "+list.next());
//        }
        System.out.println("------------------------------------------------------------------------------");
        Collections.sort(emp);
        System.out.println(emp);
    }
}
