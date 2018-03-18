/**
 * Created by Roshni Velluva Puthanidam on 7/6/16.
 */
public class HashMap {
    private final static int TABLE_SIZE = 128;

    HashEntry[] table;

    HashMap() {
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }

    public int get(int key) {
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash + 1) % TABLE_SIZE;
        if (table[hash] == null)
            return -1;
        else
            return table[hash].getValue();
    }

    public void put(int key, int value) {
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash + 1) % TABLE_SIZE;
        table[hash] = new HashEntry(key, value);
    }
    public static void main(String[] args){
        HashMap hm=new HashMap();
        hm.put(1,19);
        hm.put(2,190);
        hm.put(2,147);
        int d=hm.get(2);
        System.out.println("value corresponding to key 2 is:"+d);
    }
}
class HashEntry {
    private int key;
    private int value;

    HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}