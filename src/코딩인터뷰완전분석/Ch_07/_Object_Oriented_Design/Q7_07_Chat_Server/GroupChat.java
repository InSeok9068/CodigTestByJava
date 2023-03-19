package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_07_Chat_Server;

public class GroupChat extends Conversation {
    public void removeParticipant(User user) {
        participants.remove(user);
    }

    public void addParticipant(User user) {
        participants.add(user);
    }
}
