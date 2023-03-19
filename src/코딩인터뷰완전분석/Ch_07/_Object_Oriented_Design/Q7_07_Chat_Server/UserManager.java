package Q7_07_Chat_Server;

import java.util.Date;
import java.util.HashMap;

/* UserManager serves as the central place for the core user actions. */
public class UserManager {
    private static UserManager instance;
    private final HashMap<Integer, User> usersById = new HashMap<Integer, User>();
    private final HashMap<String, User> usersByAccountName = new HashMap<String, User>();
    private final HashMap<Integer, User> onlineUsers = new HashMap<Integer, User>();

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(User fromUser, String toAccountName) {
        User toUser = usersByAccountName.get(toAccountName);
        Q7_07_Chat_Server.AddRequest req = new Q7_07_Chat_Server.AddRequest(fromUser, toUser, new Date());
        toUser.receivedAddRequest(req);
        fromUser.sentAddRequest(req);
    }

    public void approveAddRequest(Q7_07_Chat_Server.AddRequest req) {
        req.status = Q7_07_Chat_Server.RequestStatus.Accepted;
        User from = req.getFromUser();
        User to = req.getToUser();
        from.addContact(to);
        to.addContact(from);
    }

    public void rejectAddRequest(Q7_07_Chat_Server.AddRequest req) {
        req.status = Q7_07_Chat_Server.RequestStatus.Rejected;
        User from = req.getFromUser();
        User to = req.getToUser();
        from.removeAddRequest(req);
        to.removeAddRequest(req);
    }

    public void userSignedOn(String accountName) {
        User user = usersByAccountName.get(accountName);
        if (user != null) {
            user.setStatus(new Q7_07_Chat_Server.UserStatus(Q7_07_Chat_Server.UserStatusType.Available, ""));
            onlineUsers.put(user.getId(), user);
        }
    }

    public void userSignedOff(String accountName) {
        User user = usersByAccountName.get(accountName);
        if (user != null) {
            user.setStatus(new Q7_07_Chat_Server.UserStatus(Q7_07_Chat_Server.UserStatusType.Offline, ""));
            onlineUsers.remove(user.getId());
        }
    }
}

