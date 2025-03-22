package encapsulation;

import java.util.Objects;
import java.util.Scanner;

public class Student
{
    static Scanner sc = new Scanner(System.in);
    private String name = "ABC";
    private int age=10;
    private String branch = "CST";
    private int id = 23214;
    private String email = "abc@gmail.com";
    private String password = "whevfbuyewahfbv";

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public String getBranch()
    {
        return branch;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

    public void updatePassword(String oldPassword, String newPassword)
    {
        if(!Objects.equals(oldPassword, password))
        {
            System.out.println("Invalid Password");
            return;
        }
        System.out.println("Enter new Password");
        newPassword = sc.nextLine();
        String check = "";
        System.out.println("Confirm Password");
        check = sc.nextLine();
        if(Objects.equals(newPassword, check))
        {
            System.out.println("Password Updated");
            password = newPassword;
        }
    }
}