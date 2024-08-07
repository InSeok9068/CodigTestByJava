package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_05_Online_Book_Reader;

public class User {
    private int userId;
    private String details;
    private int accountType;

    public User(int id, String details, int accountType) {
        userId = id;
        this.details = details;
        this.accountType = accountType;
    }

    public void renewMembership() {
    }

    /* getters and setters */
    public int getID() {
        return userId;
    }

    public void setID(int id) {
        userId = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
}

