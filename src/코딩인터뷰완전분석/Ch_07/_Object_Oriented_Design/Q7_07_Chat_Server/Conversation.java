package Q7_07_Chat_Server;

import java.util.ArrayList;

public abstract class Conversation {
    protected ArrayList<User> participants = new ArrayList<User>();
    protected int id;
    protected ArrayList<Q7_07_Chat_Server.Message> messages = new ArrayList<Q7_07_Chat_Server.Message>();

    public ArrayList<Q7_07_Chat_Server.Message> getMessages() {
        return messages;
    }

    public boolean addMessage(Q7_07_Chat_Server.Message m) {
        messages.add(m);
        return true;
    }

    public int getId() {
        return id;
    }
}
