package Q7_07_Chat_Server;

import java.util.Date;

public class AddRequest {
    private final User fromUser;
    private final User toUser;
    private final Date date;
    Q7_07_Chat_Server.RequestStatus status;

    public AddRequest(User from, User to, Date date) {
        fromUser = from;
        toUser = to;
        this.date = date;
        status = Q7_07_Chat_Server.RequestStatus.Unread;
    }

    public Q7_07_Chat_Server.RequestStatus getStatus() {
        return status;
    }

    public User getFromUser() {
        return fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public Date getDate() {
        return date;
    }
}
