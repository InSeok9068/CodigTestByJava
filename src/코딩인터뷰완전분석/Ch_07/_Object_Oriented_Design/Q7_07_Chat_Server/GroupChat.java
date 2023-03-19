package Q7_07_Chat_Server;

public class GroupChat extends Q7_07_Chat_Server.Conversation {
    public void removeParticipant(User user) {
        participants.remove(user);
    }

    public void addParticipant(User user) {
        participants.add(user);
    }
}
