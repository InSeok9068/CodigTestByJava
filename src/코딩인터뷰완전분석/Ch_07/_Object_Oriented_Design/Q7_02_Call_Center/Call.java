package Q7_02_Call_Center;

/* Represents a call from a user. Calls have a minimum rank and are assigned to the
 * first employee who can handle that call.
 */
public class Call {
    /* Minimal rank of employee who can handle this call. */
    private Q7_02_Call_Center.Rank rank;

    /* Person who is calling. */
    private final Q7_02_Call_Center.Caller caller;

    /* Employee who is handling call. */
    private Q7_02_Call_Center.Employee handler;

    public Call(Q7_02_Call_Center.Caller c) {
        rank = Q7_02_Call_Center.Rank.Responder;
        caller = c;
    }

    /* Set employee who is handling call. */
    public void setHandler(Q7_02_Call_Center.Employee e) {
        handler = e;
    }

    /* Play recorded message to the customer. */
    public void reply(String message) {
        System.out.println(message);
    }

    public Q7_02_Call_Center.Rank getRank() {
        return rank;
    }

    public void setRank(Q7_02_Call_Center.Rank r) {
        rank = r;
    }

    public Q7_02_Call_Center.Rank incrementRank() {
        if (rank == Q7_02_Call_Center.Rank.Responder) {
            rank = Q7_02_Call_Center.Rank.Manager;
        } else if (rank == Q7_02_Call_Center.Rank.Manager) {
            rank = Q7_02_Call_Center.Rank.Director;
        }
        return rank;
    }

    /* Disconnect call. */
    public void disconnect() {
        reply("Thank you for calling");
    }
}
