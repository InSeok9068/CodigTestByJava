package Q7_05_Online_Book_Reader;

public class OnlineReaderSystem {
    private final Q7_05_Online_Book_Reader.Library library;
    private final UserManager userManager;
    private final Q7_05_Online_Book_Reader.Display display;

    private Book activeBook;
    private User activeUser;

    public OnlineReaderSystem() {
        userManager = new UserManager();
        library = new Q7_05_Online_Book_Reader.Library();
        display = new Q7_05_Online_Book_Reader.Display();
    }

    public Q7_05_Online_Book_Reader.Library getLibrary() {
        return library;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public Q7_05_Online_Book_Reader.Display getDisplay() {
        return display;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book book) {
        display.displayBook(book);
        activeBook = book;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User user) {
        activeUser = user;
        display.displayUser(user);
    }
}
