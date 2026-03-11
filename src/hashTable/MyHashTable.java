package hashTable;

public class MyHashTable {
    private Entry[] table; //array
    private int size; //tamanho

    public MyHashTable() {
        this.table = new Entry[10];
        this.size = 0;
    }

    private int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);
        }
        return sum % table.length;
    }

    public void put(String key, String value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            newEntry.next = table[index];
            table[index] = newEntry;
        }
        size++;
    }

    public String get(String key) {
        int index = hash(key);
        Entry current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashTable map = new MyHashTable();
        map.put("nome", "João");
        map.put("idade", "25");
        map.put("cidade", "SP");

        System.out.println(map.get("nome"));   // João
        System.out.println(map.get("idade"));  // 25
        System.out.println(map.get("cidade")); // SP
        System.out.println(map.get("pais"));   // null


    }
}
