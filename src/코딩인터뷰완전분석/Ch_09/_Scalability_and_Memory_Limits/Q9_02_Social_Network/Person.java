package 코딩인터뷰완전분석.Ch_09._Scalability_and_Memory_Limits.Q9_02_Social_Network;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Integer> friends = new ArrayList<Integer>();
    private final int personID;
    private String info;

    public Person(int id) {
        this.personID = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Integer> getFriends() {
        return friends;
    }

    public int getID() {
        return personID;
    }

    public void addFriend(int id) {
        friends.add(id);
    }
}
