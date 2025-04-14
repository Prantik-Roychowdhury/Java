package generics;

import java.util.Objects;

public class employe<T>
{
    T data;
    T data2;
    employe(T data, T data2)
    {
        this.data = data;
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return data+"  "+data2;
    }
    public static <T> void print(T[]arr)
    {
        for(T i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        employe<Integer> e1 = new employe<Integer>(10,10);
        System.out.println(Objects.equals(e1.data, e1.data2));
        Integer[]arr = {1,2,3,4,5};
        String[]arr2 = {"hello", "Hi", "Fk u"};
        print(arr2);
    }
}