package Q7_12_Hash_Table;

public class Question {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Q7_12_Hash_Table.Dummy bob = new Q7_12_Hash_Table.Dummy("Bob", 20);
        Q7_12_Hash_Table.Dummy jim = new Q7_12_Hash_Table.Dummy("Jim", 25);
        Q7_12_Hash_Table.Dummy alex = new Q7_12_Hash_Table.Dummy("Alex", 30);
        Q7_12_Hash_Table.Dummy tim = new Q7_12_Hash_Table.Dummy("Tim", 35);
        Q7_12_Hash_Table.Dummy maxwell = new Q7_12_Hash_Table.Dummy("Maxwell", 40);
        Q7_12_Hash_Table.Dummy john = new Q7_12_Hash_Table.Dummy("John", 45);
        Q7_12_Hash_Table.Dummy julie = new Q7_12_Hash_Table.Dummy("Julie", 50);
        Q7_12_Hash_Table.Dummy christy = new Q7_12_Hash_Table.Dummy("Christy", 55);
        Q7_12_Hash_Table.Dummy tim2 = new Q7_12_Hash_Table.Dummy("Tim", 100); // This should replace the first "tim"

        Q7_12_Hash_Table.Dummy[] dummies = {bob, jim, alex, tim, maxwell, john, julie, christy, tim2};

        /* Test: Insert Elements. */
        Q7_12_Hash_Table.Hasher<String, Q7_12_Hash_Table.Dummy> hash = new Q7_12_Hash_Table.Hasher<String, Q7_12_Hash_Table.Dummy>(3);
        for (Q7_12_Hash_Table.Dummy d : dummies) {
            System.out.println(hash.put(d.getName(), d));
        }

        hash.printTable();

        /* Test: Recall */
        for (Q7_12_Hash_Table.Dummy d : dummies) {
            String name = d.getName();
            Q7_12_Hash_Table.Dummy dummy = hash.get(name);
            if (dummy == null) {
                System.out.println("Dummy named " + name + ": null");
            } else {
                System.out.println("Dummy named " + name + ": " + dummy);
            }
            Q7_12_Hash_Table.Dummy d2 = hash.remove(name);
            if (d2 == null) {
                System.out.println("Dummy removed named " + name + ": " + "null");
            } else {
                System.out.println("Dummy removed named " + name + ": " + d2);
            }
        }
    }

}
