package hashing.HashMap;

import java.util.HashMap;

public class Hashmap
{
    HashMap<String, Integer>map = new HashMap<>();
    public void addData(String s, int data)
    {
        map.put(s,data);
    }
    public int returnValue(String key)
    {
        return map.get(key);
    }
    public void updateValue(String key, int val)
    {
        map.put(key,val);
    }
    public void displayMap()
    {
        System.out.println("Hash Map: " + map);
    }
    public void displayKeyValues()
    {
        for(Integer value: map.values())
        {
            System.out.println("Value: "+value);
        }
    }
    public void displayKey()
    {
        for(String m: map.keySet())
        {
            System.out.println("Key: "+m);
        }
    }
}