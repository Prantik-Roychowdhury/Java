package hashing.HashMap;

public class HasMapImplementation
{
    Entry [] bucket = new Entry[16];
    private int findBucketIndex(int key)
    {
        return Math.abs(Integer.hashCode(key)%bucket.length);
    }
    public void put(int key, int val)
    {
        Entry newNode = new Entry(key,val);
        int index = findBucketIndex(key);
        Entry current = bucket[index];
        while (current!=null)
        {
            if (current.key == key)
            {
                current.value=val;
                return;
            }
            current = current.next;
        }
        newNode.next = bucket[index];
        bucket[index] = newNode;
    }
    public static void main(String[] args)
    {
        HasMapImplementation map = new HasMapImplementation();
        map.put(10,1);
        map.put(20,9);
    }
}