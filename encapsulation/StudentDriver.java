package encapsulation;

public class StudentDriver
{
    static Student s = new Student();
    static void setCall()
    {
        s.setAge(20);
        s.setBranch("CST");
        s.setEmail("abc@gmail.com");
        s.setName("ABC");
        s.setId(232424);
        s.setPassword("ABCD1234");
    }
    public static void getCall()
    {
        System.out.println(s.getAge());
        System.out.println(s.getBranch());
        System.out.println(s.getEmail());
        System.out.println(s.getName());
        System.out.println(s.getPassword());
        System.out.println(s.getId());
    }
    public static void main(String[] args)
    {
//        setCall();
        getCall();
        s.updatePassword("whevfbuyewahfbv","ABCD1234");
        System.out.println(s.getPassword());
    }
}