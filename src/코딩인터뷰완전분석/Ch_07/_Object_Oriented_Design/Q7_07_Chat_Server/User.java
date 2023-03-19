package Q7_07_Chat_Server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class User {
    private final int id;
    private Q7_07_Chat_Server.UserStatus status = null;
    private final HashMap<Integer, Q7_07_Chat_Server.PrivateChat> privateChats = new HashMap<Integer, Q7_07_Chat_Server.PrivateChat>();
    private final ArrayList<Q7_07_Chat_Server.GroupChat> groupChats = new ArrayList<Q7_07_Chat_Server.GroupChat>();
    private final HashMap<Integer, Q7_07_Chat_Server.AddRequest> receivedAddRequests = new HashMap<Integer, Q7_07_Chat_Server.AddRequest>();
    private final HashMap<Integer, Q7_07_Chat_Server.AddRequest> sentAddRequests = new HashMap<Integer, Q7_07_Chat_Server.AddRequest>();

    private final HashMap<Integer, User> contacts = new HashMap<Integer, User>();
    private final String accountName;
    private final String fullName;

    public User(int id, String accountName, String fullName) {
        this.accountName = accountName;
        this.fullName = fullName;
        this.id = id;
    }

    public boolean sendMessageToUser(User toUser, String content) {
        Q7_07_Chat_Server.PrivateChat chat = privateChats.get(toUser.getId());
        if (chat == null) {
            chat = new Q7_07_Chat_Server.PrivateChat(this, toUser);
            privateChats.put(toUser.getId(), chat);
        }
        Q7_07_Chat_Server.Message message = new Q7_07_Chat_Server.Message(content, new Date());
        return chat.addMessage(message);
    }

    public boolean sendMessageToGroupChat(int groupId, String content) {
        Q7_07_Chat_Server.GroupChat chat = groupChats.get(groupId);
        if (chat != null) {
            Q7_07_Chat_Server.Message message = new Q7_07_Chat_Server.Message(content, new Date());
            return chat.addMessage(message);
        }
        return false;
    }

    public void setStatus(Q7_07_Chat_Server.UserStatus status) {
        this.status = status;
    }

    public Q7_07_Chat_Server.UserStatus getStatus() {
        return status;
    }

    public boolean addContact(User user) {
        if (contacts.containsKey(user.getId())) {
            return false;
        } else {
            contacts.put(user.getId(), user);
            return true;
        }
    }

    public void receivedAddRequest(Q7_07_Chat_Server.AddRequest req) {
        int senderId = req.getFromUser().getId();
        if (!receivedAddRequests.containsKey(senderId)) {
            receivedAddRequests.put(senderId, req);
        }
    }

    public void sentAddRequest(Q7_07_Chat_Server.AddRequest req) {
        int receiverId = req.getFromUser().getId();
        if (!sentAddRequests.containsKey(receiverId)) {
            sentAddRequests.put(receiverId, req);
        }
    }

    public void removeAddRequest(Q7_07_Chat_Server.AddRequest req) {
        if (req.getToUser() == this) {
            receivedAddRequests.remove(req);
        } else if (req.getFromUser() == this) {
            sentAddRequests.remove(req);
        }
    }

    public void requestAddUser(String accountName) {
        Q7_07_Chat_Server.UserManager.getInstance().addUser(this, accountName);
    }

    public void addConversation(Q7_07_Chat_Server.PrivateChat conversation) {
        User otherUser = conversation.getOtherParticipant(this);
        privateChats.put(otherUser.getId(), conversation);
    }

    public void addConversation(Q7_07_Chat_Server.GroupChat conversation) {
        groupChats.add(conversation);
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getFullName() {
        return fullName;
    }
}
