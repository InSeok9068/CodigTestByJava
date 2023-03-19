package Q7_07_Chat_Server;

public class UserStatus {
    private final String message;
    private final Q7_07_Chat_Server.UserStatusType type;

    public UserStatus(Q7_07_Chat_Server.UserStatusType type, String message) {
        this.type = type;
        this.message = message;
    }

    public Q7_07_Chat_Server.UserStatusType getStatusType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
