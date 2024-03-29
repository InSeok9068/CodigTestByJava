package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_07_Chat_Server;

import java.util.ArrayList;

public abstract class Conversation {
    protected ArrayList<User> participants = new ArrayList<User>();
    protected int id;
    protected ArrayList<Message> messages = new ArrayList<Message>();

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public boolean addMessage(Message m) {
        messages.add(m);
        return true;
    }

    public int getId() {
        return id;
    }
}
