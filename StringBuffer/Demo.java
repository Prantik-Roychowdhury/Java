package StringBuffer;

public class Demo
{
    public static void main(String[] args)
    {

        StringBuffer sb = new StringBuffer();
        sb.insert(0,12);
        sb.insert(2,12);
        sb.insert(1,12);
        sb.reverse();
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}